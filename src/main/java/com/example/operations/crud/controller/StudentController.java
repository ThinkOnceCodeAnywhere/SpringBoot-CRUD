package com.example.operations.crud.controller;

import com.example.operations.crud.model.Student;
import com.example.operations.crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("students")
    public List<Student> getAll(){
        return studentService.getAll();
    }

    @PostMapping("insert")
    public String insert(@RequestBody List<Student> studentList){
        return studentService.insert(studentList);
    }

    @DeleteMapping("delete")
    public String delete(@RequestParam int id){
        return studentService.delete(id);
    }
}
