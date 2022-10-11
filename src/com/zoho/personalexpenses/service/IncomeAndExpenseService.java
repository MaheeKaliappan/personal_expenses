package com.zoho.personalexpenses.service;

import java.sql.SQLException;
import java.util.Scanner;

public class IncomeAndExpenseService {

	public void initService() throws ClassNotFoundException, SQLException {
		Scanner reader = new Scanner(System.in);
		System.out.println(
				"1.Add Income\n2.Add Expense\n3.Add Income Category\n4.Add Expense Category\n5.View Income Details\n6.View Expense Details");
		int userChoice = reader.nextInt();
		IncomeService incomeService = new IncomeService();
		ExpenseService expenseService = new ExpenseService();
		switch (userChoice) {
		case 1:
			incomeService.addIncome();
			break;
		case 2:
			expenseService.addExpense();
			break;
		case 3:
			incomeService.addIncomeCategory();
			break;
		case 4:
			expenseService.addExpenseCategory();
			break;
		case 5:
			incomeService.viewIncomeDetails();
			break;
		case 6:
			expenseService.viewExpenseDetails();
			break;

		default:
			System.out.println("Invalid Input");
			break;
		}

	}

}
