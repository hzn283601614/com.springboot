package com.springboot.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(cascade = {CascadeType.REMOVE,CascadeType.PERSIST})
    @MapsId
    private User user;
    private int maxNum;
    private int actualNum;
    @OneToMany(mappedBy = "teacher", cascade = CascadeType.REMOVE)
    private List<Student> students;

    @OneToMany(mappedBy = "teacher", cascade = CascadeType.REMOVE)
    private List<Course> courses;

    @OneToOne(mappedBy = "teacher")
    private Direction direction;

    @Column(columnDefinition = "timestamp default current_timestamp",
            insertable = false,
            updatable = false)
    private LocalDateTime insertTime;
    @Column(columnDefinition = "timestamp default current_timestamp",
            insertable = false,
            updatable = false)
    private LocalDateTime updateTime;
    public Teacher(Integer id) {
        this.id = id;
    }
}