package edu.icet.service;
import edu.icet.dto.Student;
import edu.icet.entity.StudentEntity;
import edu.icet.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImplV1 implements StudentService {


    ArrayList<Student> studentList = new ArrayList<>();
    @Value("${application.institute:ICM}")
    String instituteName;

    @Autowired
    StudentRepository repository;

    @Override
    public List<Student> studentList() {

        studentList.add(new Student(
                "Janaka",
                "madusanka",
                instituteName
        ));

        studentList.add(new Student(
                "Kasun",
                "Chaturanga",
                instituteName
        ));

        return studentList;
    }

    @Override
    public void registerStudent(Student student) {

        StudentEntity entity = new StudentEntity();
        entity.setFirstName(student.getFirstName());
        entity.setLastName(student.getLastName());
        entity.setInstitute(student.getInstitute());

        repository.save(entity);
    }
}
