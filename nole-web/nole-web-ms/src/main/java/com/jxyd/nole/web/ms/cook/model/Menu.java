package com.jxyd.nole.web.ms.cook.model;

import com.jxyd.nole.jpa.mysql.alpha.raw.model.Sys01Permission;

public class Menu extends Sys01Permission {

	private static final long serialVersionUID = 1L;
	
	private int isChecked;

	public int getIsChecked() {
		return isChecked;
	}

	public void setIsChecked(int isChecked) {
		this.isChecked = isChecked;
	}
	


}
