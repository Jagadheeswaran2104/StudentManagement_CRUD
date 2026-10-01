package com.Student.StudentManagement.Controller;

import com.Student.StudentManagement.Model.StudentModel;
import com.Student.StudentManagement.Service.StudentService;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping
    public StudentModel saveStudent(@RequestBody StudentModel student) {
        return service.saveStudent(student);
    }

    @GetMapping
    public List<StudentModel> getAllStudents() {
        return service.getAllStudents();
    }

    @GetMapping("/{id}")
    public StudentModel getStudent(@PathVariable Long id) {
        return service.getStudentById(id);
    }

    @PutMapping("/{id}")
    public StudentModel updateStudent(
            @PathVariable Long id,
            @RequestBody StudentModel student) {

        return service.updateStudent(id, student);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id) {
        return service.deleteStudent(id);
    }
}