package com.jxyd.nole.bas.excel;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author: luy
 * @Description:
 * @Date: create in 2018/3/30 15:09
 */
public class ExcelUtilsTest {
    @Test
    public void createSGFile() throws Exception {
        String[] headers = new String[]{"name", "age"};
        List<String[]> datas = new ArrayList<>();
        String[] data1 = new String[]{"张三", "10"};
        String[] data2 = new String[]{"李四", "9"};
        String[] data3 = new String[]{"王五", "8"};
        datas.add(data1);
        datas.add(data2);
        datas.add(data3);
        ExcelUtils.createSGFile("D:/data/example.xlsx", headers,datas);
    }

    @Test
    public void readSGFileByRow() throws Exception {
        List<String[]> datas=ExcelUtils.readSGFileByRow("D:/data/example.xlsx");
        assertNotNull(datas);
        assertEquals(datas.size(),4);
    }

    @Test
    public void readSGFileByColumn() throws Exception {
        List<String[]> datas = ExcelUtils.readSGFileByColumn("D:/data/example.xlsx");
        assertNotNull(datas);
        assertEquals(datas.size(),2);
    }

}