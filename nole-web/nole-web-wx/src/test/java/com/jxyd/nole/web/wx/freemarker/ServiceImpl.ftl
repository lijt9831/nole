package com.jxyd.nole.web.wx.service.impl;

import org.springframework.stereotype.Service;

import com.jxyd.nole.bas.log.Log;
import com.jxyd.nole.bas.log.LogFactory;
<#list methods as method>
import com.jxyd.nole.web.wx.controller.${moduleName?cap_first}Controller.${method.name?cap_first}Req;
import com.jxyd.nole.web.wx.controller.${moduleName?cap_first}Controller.${method.name?cap_first}Res;
</#list>
import com.jxyd.nole.web.wx.service.${moduleName?cap_first}Service;

import net.sf.json.JSONObject;

/** 
 * 说明：${moduleDescribe} 服务实现
 * 创建人：zxg
 * 创建时间：${moduleNowDate?string("yyyy")}
 */
@Service
public class ${moduleName?cap_first}ServiceImpl implements ${moduleName?cap_first}Service {

	private static final Log log = LogFactory.getLog(${moduleName?cap_first}ServiceImpl.class);
	
	<#list methods as method>
	@Override
	public ${method.name?cap_first}Res ${method.name}(${method.name?cap_first}Req ${method.name}Req) {
		${method.name?cap_first}Res ${method.name}Res = new ${method.name?cap_first}Res();
		try{
			//TODO 
		}catch(Exception e){
			log.error(JSONObject.fromObject(${method.name}Req).toString(), e);
		}
		return ${method.name}Res;
	}
	
	</#list>

}
