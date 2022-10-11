package com.zoho.personalexpenses.model;

public class Expense {
	
	private Integer expenseId;
	private String expenseCategoryId;
	private String expenseNotes;
	private String expenseDate;
	private Integer expenseAmount;
	
	public Integer getExpenseId() {
		return expenseId;
	}
	public void setExpenseId(Integer expenseId) {
		this.expenseId = expenseId;
	}
	
	public String getExpenseCategoryId() {
		return expenseCategoryId;
	}
	public void setExpenseCategoryId(String expenseCategoryId) {
		this.expenseCategoryId = expenseCategoryId;
	}
	public String getExpenseNotes() {
		return expenseNotes;
	}
	public void setExpenseNotes(String expenseNotes) {
		this.expenseNotes = expenseNotes;
	}
	public String getExpenseDate() {
		return expenseDate;
	}
	public void setExpenseDate(String expenseDate) {
		this.expenseDate = expenseDate;
	}
	public Integer getExpenseAmount() {
		return expenseAmount;
	}
	public void setExpenseAmount(Integer expenseAmount) {
		this.expenseAmount = expenseAmount;
	}
	

}
