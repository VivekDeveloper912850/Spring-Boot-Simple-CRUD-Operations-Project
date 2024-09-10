package com.Test.Practice.Service;

import com.Test.Practice.Pojo.Student;
import com.Test.Practice.Repository.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class service {
    private  userRepo repo;
    public  service(){}
    @Autowired
    public service(userRepo repo) {
        this.repo = repo;
    }

    public List<Student> getAllStudent(){
       return repo.findAll();
    }

    public Student saveStudent(Student s){
       return repo.save(s);
    }

    public Student SearchStudent(Long id){
        Optional<Student> opt = repo.findById(id);
        return opt.orElse(null);
    }



    // delete the element through database

//    public  void DeleteStudent(Long id){
//        try {
//            repo.deleteById(id);
//            System.out.println("Student element id" + id + "Delete from the database");
//        }
//        catch (Exception emp){
//            System.out.println("Element is not found in the database" + emp);
//        }
//    }

    public boolean DeleteStudent(Long id){
        if(repo.existsById(id)){
            repo.deleteById(id);
            return true;
        }
        else {
            return false;
        }
    }

    // update element from the database
    public Student updateStudent(Long id , Student st){
        Optional<Student> opt = repo.findById(id);
        if(opt.isPresent()){
            Student stu = opt.get();
            stu.setName(st.getName());
            stu.setBranch(st.getBranch());
            stu.setSession(st.getSession());
            stu.setRollno(st.getRollno());
            stu.setCourse(st.getCourse());
            stu.setCollege_Name(st.getCollege_Name());
            return  repo.save(stu);
        }
        else{
            return null;
        }
    }
}
