package com.example.RecordClass.services.abstracts;

import com.example.RecordClass.services.dtos.responses.Car.GetCarResponse;

public interface CarService {
    GetCarResponse getById(int id);
}
