package com.Test.Practice.Repository;

import com.Test.Practice.Pojo.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepo extends JpaRepository<Student, Long> {
}
