package com.jxyd.nole.bas.excel;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author zxg
 *
 */
public class ExcelUtils {

	/**
	 * Microsoft Excel 97-2003 工作表
	 */
	public static final String HSSF = ".xls";
	
	/**
	 * Microsoft Excel 工作表
	 */
	public static final String XSSF = ".xlsx";
	
	/**
	 * 绘制简单表格
	 * 
	 * @param headers
	 * @param datas
	 * @return
	 */
	private static Workbook drawSimpleGrid(String[] headers, List<String[]> datas) {

		Workbook wb = new XSSFWorkbook();

		// 表头样式
		CellStyle headerStyle = wb.createCellStyle();
		headerStyle.setAlignment(HorizontalAlignment.CENTER);
		headerStyle.setBorderTop(BorderStyle.THIN);
		headerStyle.setBorderRight(BorderStyle.THIN);
		headerStyle.setBorderBottom(BorderStyle.THIN);
		headerStyle.setBorderLeft(BorderStyle.THIN);

		// 数据样式
		CellStyle cellStyle = wb.createCellStyle();
		cellStyle.cloneStyleFrom(headerStyle);
		cellStyle.setAlignment(HorizontalAlignment.LEFT);

		XSSFSheet sheet = (XSSFSheet) wb.createSheet("Sheet1");
		XSSFRow headerRow = sheet.createRow(0);

		// 表头
		for (String header : headers) {
			int cellIndex = headerRow.getPhysicalNumberOfCells();
			XSSFCell headerCell = headerRow.createCell(cellIndex, CellType.STRING);
			headerCell.setCellStyle(headerStyle);
			headerCell.setCellValue(header);
		}

		// 数据
		for (String[] data : datas) {
			int rowIndex = sheet.getPhysicalNumberOfRows();
			XSSFRow dataRow = sheet.createRow(rowIndex);
			for (String cellValue : data) {
				int cellIndex = dataRow.getPhysicalNumberOfCells();
				XSSFCell dataCell = dataRow.createCell(cellIndex);
				dataCell.setCellValue(cellValue);
				dataCell.setCellStyle(cellStyle);
			}
		}
		return wb;
	}

	/**
	 * 创建文件
	 * 
	 * @param filePath /data/example.xlsx
	 * @param headers
	 * @param datas
	 */
	public static void createSGFile(String filePath, String[] headers, List<String[]> datas) {
		try {
			// 绘表
			Workbook simpleGrid = drawSimpleGrid(headers, datas);
			// 保存
			FileOutputStream fileOut = new FileOutputStream(filePath);
			simpleGrid.write(fileOut);
		} catch (Exception e) {
			throw new RuntimeException("导出文件失败", e);
		}
	}

	
	/**
	 * 读取简单表格excel文件内容<br>
	 * 按【行】存储，包含header
	 * 
	 * @param filePath /data/sample.xlsx
	 * @return
	 */
	public static List<String[]> readSGFileByRow(String filePath) {
		List<String[]> datas = new ArrayList<String[]>();
		Workbook wb = null;
		int i = 0, j = 0;
		try {
			wb = new XSSFWorkbook(filePath);
			Sheet sheet = wb.getSheetAt(0);
			for (Row row : sheet) {
				int length = row.getPhysicalNumberOfCells();
				String[] data = new String[length];
				j = 0;
				i++;
				for (Cell cell : row) {
					j++;
					CellType cellType = cell.getCellTypeEnum();
					if (cellType == CellType.BOOLEAN) {
						data[cell.getColumnIndex()] = String.valueOf(cell.getBooleanCellValue());
					} else if (cellType == CellType.NUMERIC) {
						data[cell.getColumnIndex()] = String.valueOf(cell.getNumericCellValue());
					} else {// String 
						data[cell.getColumnIndex()] = cell.getStringCellValue();
					}
				}
				datas.add(data);
			}
		} catch (Exception e) {
			throw new RuntimeException("读取简单表格excel文件失败[行:" + i + " ,列:" + j + "]", e);
		} finally {

			try {
				if (wb != null) {
					wb.close();
				}
			} catch (IOException ignore) {
			}
		}
		return datas;
	}
	
	/**
	 * 读取简单表格excel文件内容<br>
	 * 按【列】存储，包含header
	 * 
	 * @param filePath
	 * @return
	 */
	public static List<String[]> readSGFileByColumn(String filePath) {
		List<String[]> datas = new ArrayList<String[]>();
		Workbook wb = null;
		int i = 0, j = 0;
		try {
			wb = new XSSFWorkbook(filePath);
			Sheet sheet = wb.getSheetAt(0);
			for (Row row : sheet) {
				j = 0;
				i++;
				for (Cell cell : row) {
					j++;
					String[] data = null;
					if (datas.size() > cell.getColumnIndex()) {
						data = datas.get(cell.getColumnIndex());
					}
					if (data == null) {
						data = new String[sheet.getPhysicalNumberOfRows()];
						datas.add(data);
					}
					CellType cellType = cell.getCellTypeEnum();
					if (cellType == CellType.BOOLEAN) {
						data[row.getRowNum()] = String.valueOf(cell.getBooleanCellValue());
					} else if (cellType == CellType.NUMERIC) {
						data[row.getRowNum()] = String.valueOf(cell.getNumericCellValue());
					} else {// String 
						data[row.getRowNum()] = cell.getStringCellValue();
					}
				}
			}
		} catch (Exception e) {
			throw new RuntimeException("读取简单表格excel文件失败[行:" + i + " ,列:" + j + "]", e);
		} finally {

			try {
				if (wb != null) {
					wb.close();
				}
			} catch (IOException ignore) {
			}
		}
		return datas;
	}
}
