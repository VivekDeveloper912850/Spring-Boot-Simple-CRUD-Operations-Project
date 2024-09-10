package com.Test.Practice.Pojo;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;

@Entity
@Table(name = "Student_Test")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Reg_Id;
    private String name;
    private String college_Name;
    private String course;
    private String branch;
    private String session;
    private int rollno;

    public Student() {
    }

    public Student(Long reg_Id, String name, String college_Name, String course, String branch, String session, int rollno) {
        Reg_Id = reg_Id;
        this.name = name;
        this.college_Name = college_Name;
        this.course = course;
        this.branch = branch;
        this.session = session;
        this.rollno = rollno;
    }

    public Long getReg_Id() {
        return Reg_Id;
    }

    public String getName() {
        return name;
    }

    public String getCollege_Name() {
        return college_Name;
    }

    public String getCourse() {
        return course;
    }

    public String getBranch() {
        return branch;
    }

    public String getSession() {
        return session;
    }

    public int getRollno() {
        return rollno;
    }

    public void setReg_Id(Long reg_Id) {
        Reg_Id = reg_Id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCollege_Name(String college_Name) {
        this.college_Name = college_Name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
}
