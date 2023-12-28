package com.example.RecordClass.services.concretes;

import com.example.RecordClass.entities.Car;
import com.example.RecordClass.repositories.CarRepository;
import com.example.RecordClass.services.abstracts.CarService;
import com.example.RecordClass.services.dtos.responses.Car.GetCarResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CarManager implements CarService {
    private final CarRepository carRepository;
    @Override
    public GetCarResponse getById(int id) {
        Car car = carRepository.findById(id).orElseThrow();
        GetCarResponse getCarResponse = new GetCarResponse(car.getModelName(),car.getKilometer(),car.getYear());

        return getCarResponse;
    }
}
