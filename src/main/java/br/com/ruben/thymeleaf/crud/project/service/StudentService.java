package br.com.ruben.thymeleaf.crud.project.service;

import br.com.ruben.thymeleaf.crud.project.entity.Student;
import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);
}