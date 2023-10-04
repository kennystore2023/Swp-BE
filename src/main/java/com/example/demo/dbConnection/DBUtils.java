package com.example.demo.dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DBUtils {
    public static Connection makeConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cn = DriverManager.getConnection(
                    "jdbc:mysql://MYSQL5026.site4now.net/db_a9fac3_swp391",
                    "a9fac3_swp391", "pjswp391");
            return cn;
        } catch(SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return null;
    }


    /*public static Connection makeConnection(){
        try {
            String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
            String url = "jdbc:sqlserver://localhost:1433;databasename=Hommie;instanceName=HIEU;";
            Class.forName(driver);
            Connection cn=DriverManager.getConnection(url, "sa", "12345");
            return cn;
        } catch(ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }*/

    public static String getCurrentDate(){
        DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();
        String currentDate = date.format(now);
        return currentDate;
    }
}
