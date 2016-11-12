package com.klogle.domain;

/**
 * office Bean
 * @author klogle
 *package:com.klogle.domain
 *E-mail:klogle.one@qq.com
 */
/*
public class office {
	private String officeNo;

	public office() {
	}

	public String getOfficeNo() {
		return officeNo;
	}

	public void setOfficeNo(String officeNo) {
		this.officeNo = officeNo;
	}
	
	public String toString(){
		return "office" + officeNo;
	}

}
*/
public class office {

	private String officeNo;

	public office() {
	}

	public String getOfficeNo() {
		return officeNo;
	}

	public void setOfficeNo(String officeNo) {
		this.officeNo = officeNo;
	}

	@Override
	public String toString() {
		return "office" +officeNo;
	}
}
