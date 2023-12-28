package com.example.RecordClass.repositories;

import com.example.RecordClass.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CarRepository extends JpaRepository<Car,Integer> {
}
