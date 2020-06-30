package com.springboot.repository;

import com.springboot.entity.Direction;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectionRepository extends BaseRepository<Direction,Integer> {
    Direction findByName(String name);
}