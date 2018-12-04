package com.jxyd.nole.bas.util;

import io.swagger.annotations.ApiModelProperty;

public class From {
	
	int a;
	
	String b;
	@ApiModelProperty(required = true, value = "线路ID")
	Long c;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public Long getC() {
		return c;
	}
	public void setC(Long c) {
		this.c = c;
	}
}
