package com.Student.StudentManagement.Repository;

import com.Student.StudentManagement.Model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentModel, Long> {
}