package com.springboot.repository;

import com.springboot.entity.User;
import com.springboot.entity.Teacher;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends BaseRepository<User,Integer> {

    @Query("from Teacher t where t.id=:tid")
    Teacher find(@Param("tid") int tid);

}