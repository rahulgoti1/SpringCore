package com.rv.spring.lifecycle.bean;

public class Bio {
	private String panNo;

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	@Override
	public String toString() {
		return "Bio [panNo=" + panNo + "]";
	}

}
