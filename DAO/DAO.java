package com.example.ban_hai_san.DAO;

import com.example.ban_hai_san.Model.Products;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAO {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    public List<Products> getAllProduct() {
        List<Products> productsList = new ArrayList<>();
        String query = "Select * from Products";

        try {
            connection = new JDBCConnector().getConnection();
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                productsList.add(new Products(
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getDouble(6),
                        resultSet.getDouble(7),
                        resultSet.getString(8),
                        resultSet.getString(9)
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return productsList;
    }

    public static void main(String[] args) {
        DAO dao = new DAO();
        List<Products> list = dao.getAllProduct();

        for(Products products: list) {
            System.out.println(products);
        }
    }
}
