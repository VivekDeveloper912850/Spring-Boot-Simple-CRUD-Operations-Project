package com.Test.Practice.Controller;

import com.Test.Practice.Pojo.Student;
import com.Test.Practice.Service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    @Autowired
    private service s;
    @PostMapping("/add")
    public Student addStudent(@RequestBody Student sy){
        return  s.saveStudent(sy);
    }

    // get the data from the database
    @GetMapping("/get/{id}")
    public Student getStudent(@PathVariable Long id){
        return  s.SearchStudent(id);
    }

    // update the details from the database
    @PutMapping("/update/{id}")
    public Student updateStudent(@PathVariable Long id , @RequestBody Student st){
        return s.updateStudent(id , st);
    }

    // DELETE THE DATA FROM THE DATABASE THROUGH ID..
    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id){
      boolean isChecked   = s.DeleteStudent(id);
      if(isChecked){
          return "Student  with ID " + id + " has been deleted.";
      }
      else {
          return "Student with ID " + id + " was not found.";
      }
    }

}
