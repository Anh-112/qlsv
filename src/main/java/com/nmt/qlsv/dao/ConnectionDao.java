package com.nmt.qlsv.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDao {
    public static Connection getConnection()
    {
        try {
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//        String sql = "jdbc:sqlserver://PHAM-NGOC:1433;databaseName=QLBH;encrypt=false;user=sa;password=123456;";

            String url = "jdbc:sqlserver://PHAM-NGOC:1433;database=qlsv;encrypt=false;" +
                    "trustServerCertificate=true";
            String user = "sa";
            String password = "123456";
            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            return null;
        }
    }
}
