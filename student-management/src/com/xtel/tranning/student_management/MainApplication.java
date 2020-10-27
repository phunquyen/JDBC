package com.xtel.tranning.student_management;

import com.xtel.tranning.student_management.manager.StudentManager;

public class MainApplication {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        studentManager.add(2);
    }
}
