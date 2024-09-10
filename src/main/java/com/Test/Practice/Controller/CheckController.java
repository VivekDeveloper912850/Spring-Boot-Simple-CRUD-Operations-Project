package com.Test.Practice.Controller;

import com.Test.Practice.Pojo.Student;
import com.Test.Practice.Service.service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CheckController{
    @Autowired
   private  Student s1;
    @Autowired
    private service s;

    public void setS1(Student s1) {
        this.s1 = s1;
        s1.setReg_Id(221007L);
        s1.setBranch("CSE");
        s1.setCollege_Name("GEC SIWAN");
        s1.setName("Vivek kumar");
        s1.setCourse("B.TECH");
        s1.setRollno(30);
        s1.setSession("22-26");
    }

    public void setS(service s) {
        this.s = s;
        s.saveStudent(s1);
    }


      





}
