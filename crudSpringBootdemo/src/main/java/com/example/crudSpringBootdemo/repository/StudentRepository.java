package com.example.crudSpringBootdemo.repository;

import com.example.crudSpringBootdemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


public interface StudentRepository extends JpaRepository<Student, Long> {

}
