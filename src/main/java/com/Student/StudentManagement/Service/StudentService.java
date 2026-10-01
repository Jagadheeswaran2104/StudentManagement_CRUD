package com.Student.StudentManagement.Service;

import com.Student.StudentManagement.Model.StudentModel;
import com.Student.StudentManagement.Repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public StudentModel saveStudent(StudentModel student) {
        return repository.save(student);
    }

    public List<StudentModel> getAllStudents() {
        return repository.findAll();
    }

    public StudentModel getStudentById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public StudentModel updateStudent(Long id, StudentModel student) {

        StudentModel existing = repository.findById(id).orElse(null);

        if (existing != null) {
            existing.setName(student.getName());
            existing.setEmail(student.getEmail());
            existing.setCourse(student.getCourse());

            return repository.save(existing);
        }

        return null;
    }

    public String deleteStudent(Long id) {

        repository.deleteById(id);

        return "Student Deleted Successfully";
    }
}