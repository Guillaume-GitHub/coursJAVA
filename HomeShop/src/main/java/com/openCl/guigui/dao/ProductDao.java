package com.openCl.guigui.dao;

import com.openCl.guigui.HomeShop.Product;

import java.sql.*;
import java.util.*;

public class ProductDao {

    //-- Connexion info
    private String url = "jdbc:mysql://localhost:3306/homeshop";
    private String user = "root";
    private String pwd = "";
    /**
     * Get all produts on database
     * @return list of product
     */
    public List<Product> getAll(){
        List<Product> productsList = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(url,user,pwd);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM product");
            while (rs.next()) {
                String name = rs.getString("name");
                String desciption = rs.getString("description");
                double price = rs.getDouble("price");
                productsList.add(new Product(name,desciption,price));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productsList;
    }
}
