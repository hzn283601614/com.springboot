package com.springboot.repository;

import com.springboot.entity.Teacher;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends BaseRepository<Teacher,Integer>{
}