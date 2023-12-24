package edu.icet.controller;

import edu.icet.dto.Student;
import edu.icet.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService service;

    @GetMapping("/get-student")
    public List<Student> getStudentList(){
        return service.studentList();
    }

    @PostMapping("/reg-student")
    public void registerStudent(@RequestBody Student student){
        service.registerStudent(student);
    }
}
