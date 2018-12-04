package com.jxyd.nole.bas.util;

import java.lang.reflect.Field;

import com.jxyd.nole.bas.log.Log;
import com.jxyd.nole.bas.log.LogFactory;

import io.swagger.annotations.ApiModelProperty;

public class CheckUtils {

	private static final Log log = LogFactory.getLog(CheckUtils.class);

	public static <T> T checkNull(Object obj, Class<T> res) {
		String msg = null;
		T newInstance = null;
		try {
			// check fields
			if (obj == null) {
				msg = "Illegal argument null.";
			} else {
				Class<? extends Object> req = obj.getClass();
				Field[] fields = req.getDeclaredFields();
				for (Field field : fields) {
					Class<ApiModelProperty> annotationClass = io.swagger.annotations.ApiModelProperty.class;
					boolean bool = field.isAnnotationPresent(annotationClass);
					if (bool) {
						boolean required = field.getAnnotation(annotationClass).required();
						if (required) {
							field.setAccessible(true);
							Object object = field.get(obj);
							if (object == null) {
								msg = "The value of " + field.getName() + " can not be null.";
								break;
							}
						}
					}
				}
			}
			// set msg
			if (msg != null) {
				newInstance = res.newInstance();
				Field[] declaredFields = res.getDeclaredFields();
				for (Field field : declaredFields) {
					field.setAccessible(true);
					if (field.getName().equals("code")) {
						field.set(newInstance, "2");
					} else if (field.getName().equals("msg")) {
						field.set(newInstance, msg);
					}
				}
			}
		} catch (Exception e) {
			log.error("校验异常", e);
		}
		return newInstance;
	}
}
