package com.project.dbms_mini_project_backend;

    import java.sql.Connection;
import java.sql.DriverManager;

    public class DatabaseTest {
        public static void main(String[] args) {
           // String url = "jdbc:sqlserver://localhost\\MSSQLSERVER01:1439;databaseName=bus_pass_db;encrypt=false;trustServerCertificate=true";
            String url = "jdbc:sqlserver://localhost:1439;instanceName=MSSQLSERVER01;databaseName=bus_pass_db;encrypt=false;trustServerCertificate=true";

            String user = "root";
            String password = "test";

            try (Connection conn = DriverManager.getConnection(url, user, password)) {
                System.out.println("Connection successful!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


