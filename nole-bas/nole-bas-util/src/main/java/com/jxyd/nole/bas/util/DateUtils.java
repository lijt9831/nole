package com.jxyd.nole.bas.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zxg
 */
public class DateUtils {

    /**
     * yyyy
     */
    public static final SimpleDateFormat YEAR_1 = new SimpleDateFormat("yyyy");
    /**
     * yyyy年
     */
    public static final SimpleDateFormat YEAR_2 = new SimpleDateFormat("yyyy年");

    /**
     * yyyyMM
     */
    public static final SimpleDateFormat MONTH_1 = new SimpleDateFormat("yyyyMM");
    /**
     * yyyy/MM
     */
    public static final SimpleDateFormat MONTH_2 = new SimpleDateFormat("yyyy/MM");
    /**
     * yyyy-MM
     */
    public static final SimpleDateFormat MONTH_3 = new SimpleDateFormat("yyyy-MM");
    /**
     * yyyy年MM月
     */
    public static final SimpleDateFormat MONTH_4 = new SimpleDateFormat("yyyy年MM月");

    /**
     * yyyyMMdd
     */
    public static final SimpleDateFormat DATE_1 = new SimpleDateFormat("yyyyMMdd");
    /**
     * yyyy/MM/dd
     */
    public static final SimpleDateFormat DATE_2 = new SimpleDateFormat("yyyy/MM/dd");
    /**
     * yyyy-MM-dd
     */
    public static final SimpleDateFormat DATE_3 = new SimpleDateFormat("yyyy-MM-dd");
    /**
     * yyyy年MM月dd日
     */
    public static final SimpleDateFormat DATE_4 = new SimpleDateFormat("yyyy年MM月dd日");
    /**
     * yyyy-MM-dd(E)
     */
    public static final SimpleDateFormat DATE_5 = new SimpleDateFormat("yyyy-MM-dd(E)");

    /**
     * yyyyMMddHHmmss
     */
    public static final SimpleDateFormat TIME_1 = new SimpleDateFormat("yyyyMMddHHmmss");
    /**
     * yyyy/MM/dd HH:mm:ss
     */
    public static final SimpleDateFormat TIME_2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    /**
     * yyyy-MM-dd HH:mm:ss
     */
    public static final SimpleDateFormat TIME_3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    /**
     * yyyy年MM月dd HH时mm分ss秒
     */
    public static final SimpleDateFormat TIME_4 = new SimpleDateFormat("yyyy年MM月dd HH时mm分ss秒");

    /**
     * yyyy-MM-dd HH:mm
     */
    public static final SimpleDateFormat TIME_5 = new SimpleDateFormat("yyyy-MM-dd HH:mm");



    /**
     * 将日期格式化成字符串
     *
     * @param date
     * @param sdf
     * @return
     */
    public static String format(Date date, SimpleDateFormat sdf) {
        if (sdf == null || date == null) {
            throw new IllegalArgumentException("Params can not be null.");
        }
        return sdf.format(date);
    }


    /**
     * 将字符串转成日期
     *
     * @param dateStr
     * @param sdf
     * @return
     */
    public static Date parse(String dateStr, SimpleDateFormat sdf) {

        if (sdf == null || dateStr == null || dateStr.trim().length() == 0) {
            throw new IllegalArgumentException("Params can not be null.");
        }
        try {
            Date parsed = sdf.parse(dateStr);
            return parsed;
        } catch (ParseException e) {
            throw new IllegalArgumentException("DateStr is wrong:[" + dateStr + "]");
        }
    }

}
