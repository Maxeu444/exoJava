//package com.example.demoFirst.controllers;
//import com.example.demoFirst.models.Student.* ;
//import org.springframework.web.bind.annotation.*;
//import java.util.List;


package com.example.demoFirst.controllers;

        import com.example.demoFirst.models.Student.* ;
        import org.springframework.web.bind.annotation.*;
        import java.util.ArrayList;
        import java.util.List;

@RestController
@RequestMapping("/students")
public class CrudRestController {

    private final List<Student> students = new ArrayList<>();

    @GetMapping
    public List<Student> getAllStudents() {
        return students;
    }

    @GetMapping("/{id}")
    public Student getOneStudent(@PathVariable int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        int newId = students.size() + 1;
        student.setId(newId);
        students.add(student);
        return student;
    }

    
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable String id) {

            int studentId = Integer.parseInt(id);
            for (Student student : students) {
                if (student.getId() == studentId) {
                    students.remove(student);
                    return "Étudiant avec l'ID " + studentId + " a été supprimé.";
                }
            }
            return "Étudiant avec l'ID " + studentId + " n'a pas été trouvé.";
    }

    @PutMapping("/{id}")
    public String updateStudent(@PathVariable int id, @RequestBody Student updatedStudent) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.setPrenom(updatedStudent.getPrenom());
                student.setNom(updatedStudent.getNom());
                student.setAge(updatedStudent.getAge());
            }
        }
        return "Aucun étudiant trouvé avec cet ID";
    }
}