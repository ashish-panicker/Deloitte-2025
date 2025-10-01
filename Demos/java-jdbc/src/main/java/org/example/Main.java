package org.example;


import com.mysql.cj.jdbc.Driver;

import java.sql.*;

/**
 * JDBC: Java Database Connectivity
 * This is an API that allows a Java program to store and manipulate data in a database
 * from Java. There are 2 main parts for this
 * 1. The JDBC API: Part of standard JDK
 * 2. JDBC Driver:
 * It is generally supplied byu the database vendor, or part of the system.
 * There are 4 types of JDBC driver, with the Type 4 Driver being preferred.
 * <p>
 * How to connect application to Database
 * JDBC API (java.sql)
 * java.sql.Driver: Represents the object that is responsible for opening and establishing the connection.
 * java.sql.DriverManager: Managers the driver objects.
 * java.sql.Connection: Represents a database connection
 * java.sql.Statement: Executes complete queries
 * java.sql.PreparedStatement: Executes Incomplete queries
 * java.sql.CallableStatement: Executes stored procedures
 * java.sql.ResultSet: Represents the result set of a select query
 */
public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        String userName = "";
        String password = "";
        String url = "";

        // These 2 steps are optional with latest mysql driver
//         Driver d = new Driver(); // Create driver instance
        // Loading the driver
//         Class.forName("com.mysql.cj.jdbc.Driver");
//         DriverManager.registerDriver(d); // Register driver

//        create table customers(
//                customerNumber int            not null primary key,
//                customerName   varchar(100)   not null,
//                phone          varchar(50)    not null,
//                city           varchar(50)    not null,
//                creditLimit    decimal(10, 2) not null
//        );


        // Obtain a connection
        Connection connection = DriverManager.getConnection(url, userName, password);

        final String insertQuery = """
                    insert into customers (customerNumber, customerName, phone, city, creditLimit)
                    values (?, ?, ?, ?, ?)
                """;
        // To execute incomplete queries
        PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

        // Provide values for the placeholders
        preparedStatement.setInt(1, 111);
        preparedStatement.setString(2, "Raj");
        preparedStatement.setString(3, "8989787845");
        preparedStatement.setString(4, "New Delhi");
        preparedStatement.setDouble(5, 50000);

        // For DML queries use executeUpdate()
        int rowsUpdated = preparedStatement.executeUpdate();

        // Execute a query
        final String selectQuery = "select * from customers";
        // Create a Statement object
        Statement statement = connection.createStatement();
        // Execute the query and obtain the result set
        ResultSet resultSet = statement.executeQuery(selectQuery);

        while (resultSet.next()) {
            int customerNumber      = resultSet.getInt("customerNumber");
            String customerName     = resultSet.getString("customerName");
            String phone            = resultSet.getString("phone");
            String city             = resultSet.getString("city");
            double creditLimit      = resultSet.getDouble("creditLimit");
            System.out.println(
                    customerNumber + "\t" + customerName + "\t" + phone + "\t" + city + "\t"
                    + creditLimit
            );
        }
        // Close connection
        connection.close();

    }
}