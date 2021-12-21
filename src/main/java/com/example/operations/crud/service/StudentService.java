package com.example.operations.crud.service;


import com.example.operations.crud.model.Student;
import com.example.operations.crud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;


    //Retrieve or Read
    public List<Student> getAll(){
        return studentRepository.findAll();
    }


    //Create
    public String insert(List<Student> studentsList){
        studentRepository.saveAll(studentsList);
        return "Inserted into DB";
    }

    //Delete
    public String delete(int id){
        studentRepository.deleteById(id);
        return "Deleted Successfully";
    }


}
