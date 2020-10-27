package com.xtel.tranning.student_management.entities;

public class Student {
    private static String name;
    private int id;
    private int old;
    private String address_birth;
    private int gender;

    public Student(){

    }

    public Student(String name, int old, String address_birth, int gender) {
        this.name = name;
        this.old = old;
        this.address_birth = address_birth;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public String getAddress_birth() {
        return address_birth;
    }

    public void setAddress_birth(String address_birth) {
        this.address_birth = address_birth;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }
}
