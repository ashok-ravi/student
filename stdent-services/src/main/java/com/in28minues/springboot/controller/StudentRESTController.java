package com.in28minues.springboot.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minues.springboot.model.Student;

@RestController
public class StudentRESTController
{
    @RequestMapping(value = "/student")
    public List<Student> getAllEmployees()
    {
        List<Student> students = new LinkedList<Student>();
        
        Student empOne = new Student(1,"Lokesh",100);
        Student empTwo = new Student(2,"Amit",90);
        Student empThree = new Student(3,"Kirti",100);

        students.add(empOne);
        students.add(empTwo);
        students.add(empThree);
        
        return students;
    }
      
    @RequestMapping(value = "/student/{id}")
    public ResponseEntity<Student> getEmployeeById (@PathVariable("id") int id)
    {
        if (id <= 3) {
            Student student = getAllEmployees().get(id+1);
            return new ResponseEntity<Student>(student, HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
}