package br.com.ruben.thymeleaf.crud.project.repository;

import br.com.ruben.thymeleaf.crud.project.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long>{

}