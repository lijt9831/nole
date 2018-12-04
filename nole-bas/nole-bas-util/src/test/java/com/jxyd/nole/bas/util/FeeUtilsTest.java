package com.jxyd.nole.bas.util;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * @Author: luy
 * @Description:
 * @Date: create in 2018/3/30 17:12
 */
public class FeeUtilsTest {

    BigDecimal a, b,c;

    @Before
    public void setUp() throws Exception {
        a = new BigDecimal(2);
        b = new BigDecimal(3);
    }

    @Test
    public void jia() throws Exception {
        c=FeeUtils.jia(a,b);
        assertEquals(c.intValue(),5);
    }

    @Test
    public void jian() throws Exception {
        c=FeeUtils.jian(a,b);
        assertEquals(c.intValue(),-1);
    }

    @Test
    public void cheng() throws Exception {
        c=FeeUtils.cheng(a,b);
        assertEquals(c.intValue(),6);
    }

    @Test
    public void chu() throws Exception {
        c=FeeUtils.chu(a,b);
        assertEquals(c.intValue(),0);
    }

    @Test
    public void a_lt_b() throws Exception {
        boolean flag = FeeUtils.a_lt_b(a,b);
        assertTrue(flag);
    }

    @Test
    public void a_gt_b() throws Exception {
        boolean flag = FeeUtils.a_gt_b(a,b);
        assertFalse(flag);
    }

    @Test
    public void a_eq_b() throws Exception {
        boolean flag = FeeUtils.a_eq_b(a,b);
        assertFalse(flag);
    }

    @Test
    public void a_lteq_b() throws Exception {
        boolean flag = FeeUtils.a_lt_b(a,b);
        assertTrue(flag);
    }

    @Test
    public void a_gteq_b() throws Exception {
        boolean flag = FeeUtils.a_gt_b(a,b);
        assertFalse(flag);
    }

    @Test
    public void format() throws Exception {
        String str = FeeUtils.format(new BigDecimal("1.22"));
        assertEquals(str,"1.22");

        String str1 = FeeUtils.format(new BigDecimal(1.278));
        assertEquals(str1,"1.28");

        String str2 = FeeUtils.format(new BigDecimal(1.2222));
        assertEquals(str2,"1.22");
    }

    @Test
    public void formatG() throws Exception {
        String str = FeeUtils.formatG(new BigDecimal("23121111.22"));
        assertEquals(str,"23,121,111.22");
    }

}