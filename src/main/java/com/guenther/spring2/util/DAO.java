package com.guenther.spring2.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 * Created by DELL on 8/29/2017.
 */
public class DAO {

    public static boolean addspecs(
            String address,
            String company,
            String city,
            String state,
            String weight

    ) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection mysqlConnection;
            mysqlConnection = DriverManager.getConnection(
                    DBCredentials.DB_ADDRESS,
                    DBCredentials.USERNAME,
                    DBCredentials.PASSWORD);
            String addUserCommand = "INSERT INTO qualcomminfo " +
                    "(address, company, city, state, weight) " +
                    "VALUES ('" +
                    address + "', '" +
                    company + "', '" +
                    city + "', '" +
                    state + "', '" +
                    weight + "')";
            System.out.println("SQL Query " + addUserCommand);
            Statement st = mysqlConnection.createStatement();// creates the statement
            int result = st.executeUpdate(addUserCommand);// executes the statement


            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }


}
