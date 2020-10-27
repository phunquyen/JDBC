package com.xtel.tranning.student_management.model;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static String URL = "jdbc:mysql://localhost:3306/db_student";
    private static String USER_NAME = "root";
    private static String PASSWORD = "";
//    private static String fileName = "E:\\work\\xtel\\tranning\\student-management\\config\\config.properties";
//    public static void main(String[] args) throws IOException {
//        FileReader fileReader = new FileReader(fileName);
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//        int i;
//        while ((i = bufferedReader.read()) != -1) {
//            System.out.print((char) i);
//        }
//        bufferedReader.close();
//        fileReader.close();
//    }
    public static Connection createConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER_NAME, PASSWORD);
    }
}
