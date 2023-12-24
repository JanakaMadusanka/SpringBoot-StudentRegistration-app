package edu.icet.service;
import edu.icet.dto.Student;
import edu.icet.entity.StudentEntity;
import edu.icet.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImplV1 implements StudentService {

    @Value("${application.institute:ICM}")
    String instituteName;

    @Autowired
    StudentRepository repository;

    public Iterable<StudentEntity> studentList() {
        return repository.findAll();
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
