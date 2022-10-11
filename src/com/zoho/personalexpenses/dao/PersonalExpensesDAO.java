package com.zoho.personalexpenses.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.zoho.personalexpenses.model.Income;
import com.zoho.personalexpenses.model.IncomeCategory;

public class PersonalExpensesDAO {

	static Connection connection;
	PreparedStatement preparedStatement;
	ResultSet resultSet;

	private void getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/personalexpenses?characterEncoding=latin1&useConfigs=maxPerformance",
				"root", "root");
	}

	public List<IncomeCategory> fetchIncomeCategoryList() throws ClassNotFoundException, SQLException {
		getConnection();
		String sqlQuery = "SELECT * FROM income_category";
		List<IncomeCategory> incomeCategoryList = new ArrayList<IncomeCategory>();
		preparedStatement = connection.prepareStatement(sqlQuery);
		resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			IncomeCategory incomeCategory = new IncomeCategory();
			incomeCategory.setCategoryId(resultSet.getInt(1));
			incomeCategory.setCategoryType(resultSet.getString(2));
			incomeCategoryList.add(incomeCategory);

		}
		return incomeCategoryList;

	}

	public void addIncomeCategory(String categoryName) throws ClassNotFoundException, SQLException {
		getConnection();
		String sqlQuery = "INSERT INTO income_category (income_type) VALUES(?)";
		preparedStatement = connection.prepareStatement(sqlQuery);
		preparedStatement.setString(1, categoryName);
		preparedStatement.executeUpdate();
		
	}

	public int fetchIncomeAmount() throws ClassNotFoundException, SQLException {
		getConnection();
		String sqlQuery ="SELECT INCOME_AMOUNT FROM USER";
		int incomeAmount = 0;
		preparedStatement = connection.prepareStatement(sqlQuery);
		resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			
			incomeAmount =resultSet.getInt(1);
			

		}
		return incomeAmount;
		
	}

	public void addIncomeDetails(Income income) throws ClassNotFoundException, SQLException {
		getConnection();
		String sqlQuery = "INSERT INTO USER ()";
		
	}

}
