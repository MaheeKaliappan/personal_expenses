package com.zoho.personalexpenses.controller;

import java.sql.SQLException;

import com.zoho.personalexpenses.service.IncomeAndExpenseService;

public class PersonalIncomeAndExpense {

	public static void main(String[] args) {
		
		
		IncomeAndExpenseService incomeAndExpenseService = new IncomeAndExpenseService();
		try {
			incomeAndExpenseService.initService();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
