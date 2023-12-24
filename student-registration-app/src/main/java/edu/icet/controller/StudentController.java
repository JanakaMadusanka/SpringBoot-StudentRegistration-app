package edu.icet.controller;

import edu.icet.dto.Student;
import edu.icet.entity.StudentEntity;
import edu.icet.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
public class StudentController {
    @Autowired
    StudentService service;

    @GetMapping("/get-student")
    public Iterable<StudentEntity> getStudentList(){
        return service.studentList();
    }

    @PostMapping("/reg-student")
    public void registerStudent(@RequestBody Student student){
        service.registerStudent(student);
    }
}
