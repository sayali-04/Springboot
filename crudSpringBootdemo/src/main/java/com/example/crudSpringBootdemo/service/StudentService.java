package com.example.crudSpringBootdemo.service;

import com.example.crudSpringBootdemo.entity.Student;
import com.example.crudSpringBootdemo.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student studentReq) {

        Student studentResp=studentRepository.save(studentReq);

        return studentResp;
    }

    public Student getStudent(Long id) {
         Optional<Student>studentResp=studentRepository.findById(id);

         if(studentResp.isPresent()) {
             return studentResp.get();
         }
         return null;
    }

    public List<Student> getAllStudent() {
        List<Student> studentList=studentRepository.findAll();
        return studentList;
    }

    public Student updateStudent(Long id, Student studentReq) {
        Optional<Student> existingStudent=studentRepository.findById(id);
        if(existingStudent.isEmpty()) {
           return null;
        }
        Student studentToSave=existingStudent.get();
        studentToSave.setName(studentReq.getName());
        studentToSave.setAge(studentReq.getAge());
        studentToSave.setSubject(studentReq.getSubject());
        studentToSave.setRollNo(studentReq.getRollNo());
        studentToSave.setEmail(studentReq.getEmail());

        return studentRepository.save(studentToSave);
    }

    public boolean deleteStudent(Long id) {
        Boolean isStudent = studentRepository.existsById(id);
        if(!isStudent) {
            return false;
        }
        studentRepository.deleteById(id);
        return true;
    }



    //1.EndPoint listen
    //2.Business logic
    //3.Interact with db to store
    //4.Response back to client
}
