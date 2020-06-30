package com.springboot.repository;

import com.springboot.entity.Course;
import com.springboot.entity.SC;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SCRepository extends BaseRepository<SC,Integer>{
    void deleteAllByCourse_Id(int id);
    List<SC> findAllByCourse(Course course);

    @Query("SELECT sc FROM Elective sc WHERE sc.course.id=:cid")
    Optional<SC> getSC(@Param("cid")int cid);

    @Query("SELECT sc FROM Elective sc WHERE sc.student.user.id=:sid")
    List<SC> findStudent(@Param("sid")int sid);
}