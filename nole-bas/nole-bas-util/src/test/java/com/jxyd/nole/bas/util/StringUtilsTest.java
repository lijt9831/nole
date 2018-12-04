package com.jxyd.nole.bas.util;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author: luy
 * @Description:
 * @Date: create in 2018/3/30 17:14
 */
public class StringUtilsTest {
    @Test
    public void isBlank() throws Exception {
        assertTrue(StringUtils.isBlank(null));
        assertTrue(StringUtils.isBlank(""));
        assertTrue(StringUtils.isBlank(" "));
        assertFalse(StringUtils.isBlank("null"));
        assertFalse(StringUtils.isBlank(" null "));
    }

    @Test
    public void testcut(){
//    	String cut = StringUtils.maxcut("dddd[123]eeee", "[", "]");
//    	System.out.println(cut);
    	String cut = StringUtils.maxcut("123]eeee", "1", "");
    	System.out.println(cut);
    }
    
    @Test
    public void testUpperCamel(){
    	String upperCamel = StringUtils.upperCamel("HOW_ARE_YOU");
    	System.out.println(upperCamel);
    }
    @Test
    public void testLowerCamel(){
    	String upperCamel = StringUtils.lowerCamel("HOW_ARE_YOU");
    	System.out.println(upperCamel);
    }
}