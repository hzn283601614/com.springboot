package com.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
/*import javax.validation.constraints.Max;
import javax.validation.constraints.PositiveOrZero;*/

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SC {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String detail;
    private double grade;
    private double weight;

    @ManyToOne
    private Student student;
    @ManyToOne
    private Course course;

    @Column(columnDefinition = "timestamp default current_timestamp",
            insertable = false,
            updatable = false)
    private LocalDateTime updateTime;
}