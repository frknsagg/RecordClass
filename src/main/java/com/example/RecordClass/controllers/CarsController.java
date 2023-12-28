package com.example.RecordClass.controllers;

import com.example.RecordClass.services.abstracts.CarService;
import com.example.RecordClass.services.dtos.responses.Car.GetCarResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cars")
@AllArgsConstructor
public class CarsController {

    private CarService carService;

    @GetMapping("/{id}")
    public GetCarResponse getById(@PathVariable int id){
        return carService.getById(id);
    }
}
