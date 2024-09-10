package com.Test.Practice;

import com.Test.Practice.Controller.CheckController;
import com.Test.Practice.Pojo.Student;
import com.Test.Practice.Service.service;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class JustPracticeApplication {
//	private static service s;
//    @Autowired
//	public JustPracticeApplication(service s) {
//		this.s = s;
//	}


	public static void main(String[] args) {

		SpringApplication.run(JustPracticeApplication.class, args);
		//Student s1 = new Student();

		//CheckController c1 = new CheckController();
		//c1.setS1(s1);
		//c1.setS(s);
//       List<Student> stu =  s.getAllStudent();
//		for(int i = 0; i < stu.size(); i++){
//			Student student = stu.get(i);
//			System.out.println("Reg id" + student.getReg_Id());
//			System.out.println(student.getBranch());
//			System.out.println(student.getCollege_Name());
//			System.out.println(student.getCourse());
//			System.out.println(student.getRollno());
//			System.out.println(student.getName());
//			System.out.println(student.getSession());
//		}
		//Student S1 = new Student(32321L,"vivek","gec siwan","btech","cse","22-26",30);
		//s.saveStudent(S1);
		//Search the element
//
//		Optional<Student> opt = s.SearchStudent(221007L);
//		if(opt.isPresent()){
//			Student stu = opt.get();
//			System.out.println(stu.getName());
//		}
//		else {
//			System.out.println("Element is Not Present in this Data Base");
//		}
//
//		Student s5 = new Student();
//		s5.setName("Vikash Kumar");
//
//		Student s6 = s.UpdateStudent(32321L ,s5 );
//
//		if(s6 == null){
//			System.out.println("Element is not found in database");
//		}
//		else{
//			System.out.println("Element is Details are updates ");
//		}
     // delete the element from database
		  // s.DeleteStudent(32321L);
//		Long id = 2210079L;
//		String name = "Vikash Kumar";
//		String branch = "Civil";
//		// update the data from the database
//		 Student s8= s.updateStudent(id , name , branch);
//		 if(s8 == null){
//			 System.out.println("Element is not Found in this database");
//		 }
//		 else {
//			 System.out.println("Through id database is update");
//		 }
	}

}
