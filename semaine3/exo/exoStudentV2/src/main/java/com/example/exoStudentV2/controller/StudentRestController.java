package com.example.exoStudentV2.controller;

import com.example.exoStudentV2.model.Student;
import com.example.exoStudentV2.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentRestController {

private final IStudentService studentService;


    @Autowired
    public StudentRestController(IStudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping("/") // http://localhost:8080/
    public String home() {
        return "home";
    }

    @GetMapping // http://localhost:8080/students
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

//    @GetMapping("/search")
//    public List<Student> searchStudentsByLastName(@RequestParam("lastName") String lastName) {
//        return studentService.getStudentByLastname(lastName);
//    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id,@RequestBody Student student){
        return studentService.updateStudent(id,student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
    }


}
