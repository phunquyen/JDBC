package com.xtel.tranning.student_management.model;

import com.xtel.tranning.student_management.entities.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDao {
    public static void insert(Student std) throws SQLException{
        Connection connection = ConnectionFactory.createConnection();
        PreparedStatement ps = null;
        try{
            String sql = "insert into student(name,age,gender,address) values(?,?,?,?)";
            ps = connection.prepareStatement(sql);
            ps.setString(1, std.getName());
            ps.setInt(2, std.getOld());
            ps.setInt(3, std.getGender());
            ps.setString(4, std.getAddress_birth());
            ps.execute();
        }
        finally {
            close(ps);
            close(connection);
        }
    }

//    public static void check(Student std) throws SQLException{
//        Connection connection = ConnectionFactory.createConnection();
//        PreparedStatement ps = null;
//        try{
//            String sql = "select count (name) from student";
//            ps = connection.prepareStatement(sql);
//            ps.execute();
//        }
//        finally {
//            close(ps);
//            close(connection);
//        }
//    }

    public static void close(AutoCloseable closeable){
        if(closeable == null) return;
        try{
            closeable.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
