package com.jxyd.nole.web.wx.service;

<#list methods as method>
import com.jxyd.nole.web.wx.controller.${moduleName?cap_first}Controller.${method.name?cap_first}Req;
import com.jxyd.nole.web.wx.controller.${moduleName?cap_first}Controller.${method.name?cap_first}Res;
</#list>

/** 
 * 说明：${moduleDescribe} 服务接口
 * 创建人：zxg
 * 创建时间：${moduleNowDate?string("yyyy-MM-dd")}
 */
public interface ${moduleName?cap_first}Service {

	<#list methods as method>
	${method.name?cap_first}Res ${method.name}(${method.name?cap_first}Req ${method.name}Req);
	
	</#list>
}
