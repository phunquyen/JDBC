package com.xtel.tranning.student_management.manager;

import com.xtel.tranning.student_management.entities.Student;
import com.xtel.tranning.student_management.model.StudentDao;

import java.sql.SQLException;
import java.util.*;

public class StudentManager {
    private static Scanner sc = new Scanner(System.in);

    public void add(int numberOfStudents) {
        //input student
        List<Student> stdStudentList = new ArrayList<>();
        for (int i = 0; i < numberOfStudents; i++) {
            Student std = input();
            stdStudentList.add(std);
        }
        //check

        // insert student into db
        for (Student student : stdStudentList) {
            try {
                StudentDao.insert(student);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public Student input() {
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter old: ");
        int old = Integer.parseInt(sc.nextLine());
        System.out.print("Enter address birth: ");
        String address_birth = sc.nextLine();
        System.out.print("Enter gender: ");
        int gender = Integer.parseInt(sc.nextLine());
        System.out.println("");
        return new Student(name, old, address_birth, gender);
    }
}

