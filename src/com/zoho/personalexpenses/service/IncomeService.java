package com.zoho.personalexpenses.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.zoho.personalexpenses.dao.PersonalExpensesDAO;
import com.zoho.personalexpenses.model.Income;
import com.zoho.personalexpenses.model.IncomeCategory;

public class IncomeService {
	private PersonalExpensesDAO personalExpensesDAO = new PersonalExpensesDAO();

	public void addIncome() throws ClassNotFoundException, SQLException {

		List<IncomeCategory> incomeCategoryList = personalExpensesDAO.fetchIncomeCategoryList();
		if (incomeCategoryList.size() == 0) {
			System.out.println("Income Category List Is Empty Please Add Income Category First");
			addIncomeCategory();
		} else {
			Income income = new Income();
			Scanner reader = new Scanner(System.in);
			System.out.println("Enter Date");
			income.setIncomeDate(reader.next());
			System.out.println("Enter Type Id\n");
			for (int index = 0; index < incomeCategoryList.size(); index++) {
				System.out.println((index + 1) + " : " + incomeCategoryList.get(index).getCategoryType());

			}
			income.setIncomeCategoryId(reader.nextInt());
			System.out.println("Enter Income Amount");
			int incomeAmount = personalExpensesDAO.fetchIncomeAmount();
			if(incomeAmount == 0)
			{
				income.setIncomeAmount(reader.nextInt());

			}
			else
			{
				income.setIncomeAmount((incomeAmount+(reader.nextInt())));

			}
			System.out.println("Enter Notes");
			income.setIncomeNotes(reader.nextLine());
			personalExpensesDAO.addIncomeDetails(income);
			
			
			

		}

	}

	public void addIncomeCategory() throws ClassNotFoundException, SQLException {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter Category Name");
		String categoryName = reader.next();
		personalExpensesDAO.addIncomeCategory(categoryName);

	}

	public void viewIncomeDetails() {
		// TODO Auto-generated method stub

	}

}
