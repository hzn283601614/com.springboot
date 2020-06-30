package com.springboot.service;
import com.springboot.entity.Direction;
import com.springboot.entity.Student;
import com.springboot.entity.Teacher;
import com.springboot.repository.DirectionRepository;
import com.springboot.repository.StudentRepository;
import com.springboot.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StudentService {
    @Autowired
    StudentRepository sr;
    @Autowired
    TeacherService ts;
    @Autowired
    DirectionRepository dr;
    @Autowired
    TeacherRepository tr;

    public Student getStudent(int sid) {
        return sr.find(sid);
    }
    public Direction getDirection(int did) {
        return dr.findById(did).orElse(null);
    }

    public List<Teacher> teacherList() {
        return  tr.findAll();
    }
    public Student saveStudent(Student student) {
        return  sr.save(student);
    }


}