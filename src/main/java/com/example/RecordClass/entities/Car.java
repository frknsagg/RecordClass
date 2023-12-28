package com.example.RecordClass.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cars")
public class Car {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "model_name")
    private String modelName;
    @Column (name = "kilometer", nullable = false)
    private int kilometer;

    @Column(name = "year", nullable = false)
    private int year;

}