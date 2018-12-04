package com.jxyd.nole.bas.log;


public class LogFactory {

	public static Log getLog(Class<?> clazz) {
		return new Log(clazz);
	}

}
