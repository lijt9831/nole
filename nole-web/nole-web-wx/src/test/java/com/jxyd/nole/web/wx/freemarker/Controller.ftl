package com.jxyd.nole.web.wx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jxyd.nole.bas.util.CheckUtils;
import com.jxyd.nole.web.wx.service.${moduleName?cap_first}Service;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;

/** 
 * 说明：${moduleDescribe}
 * 创建人：zxg
 * 创建时间：${moduleNowDate?string("yyyy-MM-dd")}
 */
@RestController
public class ${moduleName?cap_first}Controller {

	@Autowired
	private ${moduleName?cap_first}Service ${moduleName}Service;
	
	// ------------- 方法区 ----------------
	<#list methods as method>
	@ApiOperation(value = "${method.describe}")
	@RequestMapping(value = "${method.path}", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8" }, consumes = { "application/json;charset=UTF-8" })
	private ${method.name?cap_first}Res ${method.name}(@RequestBody ${method.name?cap_first}Req ${method.name}Req) {
		${method.name?cap_first}Res ${method.name}Res = CheckUtils.checkNull(${method.name}Req, ${method.name?cap_first}Res.class);
		if (${method.name}Res != null) {
			return ${method.name}Res;
		}
		return ${moduleName}Service.${method.name}(${method.name}Req);
	}
	
	</#list>
	// ------------- 实体区 ----------------
	<#list methods as method>
	@ApiModel(value="${moduleName?cap_first}Controller.${method.name?cap_first}Req")
	public static class ${method.name?cap_first}Req{
	
		<#list method.req.items as item>
		@ApiModelProperty(required = ${item.required?c}, value = "${item.description}")
		private ${item.type}<#if item.child?exists><${item.name?substring(0,item.name?length-4)?cap_first}></#if> ${item.name};
		
		</#list>
		<#list method.req.items as item>
		public ${item.type}<#if item.child?exists><${item.name?substring(0,item.name?length-4)?cap_first}></#if> get${item.name?cap_first}() {return ${item.name};}
		public void set${item.name?cap_first}(${item.type}<#if item.child?exists><${item.name?substring(0,item.name?length-4)?cap_first}></#if> ${item.name}) {this.${item.name} = ${item.name};}
		
		</#list>
		<#list method.req.items as item>
		<#if item.child?exists>
		public static class ${item.name?substring(0,item.name?length-4)?cap_first}{
			<#list item.child.items as citem>
			@ApiModelProperty(required = ${citem.required?c}, value = "${citem.description}")
			private ${citem.type} ${citem.name};
			
			</#list>
			<#list item.child.items as citem>
			public ${citem.type} get${citem.name?cap_first}() {return ${citem.name};}
			public void set${citem.name?cap_first}(${citem.type} ${citem.name}) {this.${citem.name} = ${citem.name};}
			
			</#list>
		}
		</#if>
		</#list>
		
	}
	
	@ApiModel(value="${moduleName?cap_first}Controller.${method.name?cap_first}Res")
	public static class ${method.name?cap_first}Res{
	
		<#list method.res.items as item>
		@ApiModelProperty(required = ${item.required?c}, value = "${item.description}")
		private ${item.type}<#if item.child?exists><${item.name?substring(0,item.name?length-4)?cap_first}></#if> ${item.name};
		
		</#list>
		<#list method.res.items as item>
		public ${item.type}<#if item.child?exists><${item.name?substring(0,item.name?length-4)?cap_first}></#if> get${item.name?cap_first}() {return ${item.name};}
		public void set${item.name?cap_first}(${item.type}<#if item.child?exists><${item.name?substring(0,item.name?length-4)?cap_first}></#if> ${item.name}) {this.${item.name} = ${item.name};}
		
		</#list>
		<#list method.res.items as item>
		<#if item.child?exists>
		public static class ${item.name?substring(0,item.name?length-4)?cap_first}{
			<#list item.child.items as citem>
			@ApiModelProperty(required = ${citem.required?c}, value = "${citem.description}")
			private ${citem.type} ${citem.name};
			
			</#list>
			<#list item.child.items as citem>
			public ${citem.type} get${citem.name?cap_first}() {return ${citem.name};}
			public void set${citem.name?cap_first}(${citem.type} ${citem.name}) {this.${citem.name} = ${citem.name};}
			
			</#list>
		}
		</#if>
		</#list>
	}
	
	</#list>
}
