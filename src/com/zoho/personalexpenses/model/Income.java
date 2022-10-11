package com.zoho.personalexpenses.model;

public class Income {

	private Integer incomeId;
	private Integer incomeCategoryId;
	private String incomeNotes;
	private String incomeDate;
	private Integer incomeAmount;
	
	public Integer getIncomeId() {
		return incomeId;
	}
	public void setIncomeId(Integer incomeId) {
		this.incomeId = incomeId;
	}
	
	public Integer getIncomeCategoryId() {
		return incomeCategoryId;
	}
	public void setIncomeCategoryId(Integer incomeCategoryId) {
		this.incomeCategoryId = incomeCategoryId;
	}
	public String getIncomeNotes() {
		return incomeNotes;
	}
	public void setIncomeNotes(String incomeNotes) {
		this.incomeNotes = incomeNotes;
	}
	public String getIncomeDate() {
		return incomeDate;
	}
	public void setIncomeDate(String incomeDate) {
		this.incomeDate = incomeDate;
	}
	public Integer getIncomeAmount() {
		return incomeAmount;
	}
	public void setIncomeAmount(Integer incomeAmount) {
		this.incomeAmount = incomeAmount;
	}
	
}
