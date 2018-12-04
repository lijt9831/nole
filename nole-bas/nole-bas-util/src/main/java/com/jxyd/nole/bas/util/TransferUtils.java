package com.jxyd.nole.bas.util;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class TransferUtils {
	
	public static <T> List<T> transfer2list(List<?> list, Class<T> t){
		try {
			List<T> resultList = new ArrayList<T>();
			for (Object o : list) {
				T ni = t.newInstance();
				transfer(o, ni);
				resultList.add(ni);
			}
			return resultList;
		} catch (Exception e) {
			throw new RuntimeException("传递值失败", e);
		}
	}
	

	/**
	 * 将同名、同类型的属性值从 from 传递到 class to ,并返回 to 的实例
	 * 
	 * @param from
	 * @param t
	 * @return
	 */
	public static <T> T transfer(Object from, Class<T> t) {
		try {
			T ni = t.newInstance();
			transfer(from, ni);
			return ni;
		} catch (Exception e) {
			throw new RuntimeException("传递值失败", e);
		}
	}

	/**
	 * 将同名、同类型的属性值从 from 传递到 to
	 * 
	 * @param from
	 * @param to
	 */
	public static void transfer(Object from, Object to) {
		try {
			BeanInfo biFrom = Introspector.getBeanInfo(from.getClass(), Object.class);
			BeanInfo biTo = Introspector.getBeanInfo(to.getClass(), Object.class);

			PropertyDescriptor[] pdsFrom = biFrom.getPropertyDescriptors();
			PropertyDescriptor[] pdsTo = biTo.getPropertyDescriptors();

			for (PropertyDescriptor pdFrom : pdsFrom) {
				for (PropertyDescriptor pdTo : pdsTo) {
					String nameFrom = pdFrom.getName();
					String nameTo = pdTo.getName();
					// 属性名是否相同
					if (!nameFrom.equals(nameTo))
						continue;
					Class<?> typeFrom = pdFrom.getPropertyType();
					Class<?> typeTo = pdTo.getPropertyType();
					// 属性类型是否相同
					if (!typeFrom.equals(typeTo))
						continue;
					Method readMethod = pdFrom.getReadMethod();
					Method writeMethod = pdTo.getWriteMethod();
					// 传值
					writeMethod.invoke(to, readMethod.invoke(from));
					break;
				}
			}

		} catch (Exception e) {
			throw new RuntimeException("传递值失败", e);
		}
	}
}
