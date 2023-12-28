package com.example.RecordClass.services.dtos.responses.Car;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
public record GetCarResponse(String modelName, double daily_price , int year) {

}
