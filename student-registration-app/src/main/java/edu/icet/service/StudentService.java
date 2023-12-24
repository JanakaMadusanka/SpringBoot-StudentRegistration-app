package edu.icet.service;

import edu.icet.dto.Student;
import edu.icet.entity.StudentEntity;

import java.util.List;

public interface StudentService {
    Iterable<StudentEntity> studentList();
    void registerStudent(Student student);
}
