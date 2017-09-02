package com.rv.spring.lifecycle.bean;

public class Adhar {
	private String adharNo;

	public String getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}

	@Override
	public String toString() {
		return "Adhar [adharNo=" + adharNo + "]";
	}

}
