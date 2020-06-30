package com.springboot.repository;

import com.springboot.entity.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



@Repository
public interface StudentRepository extends BaseRepository<Student,Integer> {
    @Query("from Student s where s.id=:sid")
    Student find(@Param("sid") int sid);

    @Query("select s from Student s where s.user.number=:number")
    Student findByNumber(@Param("number") int number);
}