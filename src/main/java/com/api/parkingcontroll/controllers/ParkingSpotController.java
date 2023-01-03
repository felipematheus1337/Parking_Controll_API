package com.api.parkingcontroll.controllers;


import com.api.parkingcontroll.dtos.ParkingSpotDTO;
import com.api.parkingcontroll.models.ParkingSpotModel;
import com.api.parkingcontroll.services.ParkingSpotServiceImpl;
import jakarta.validation.Valid;
import org.apache.coyote.Response;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/parking-spot")
public class ParkingSpotController {

    final ParkingSpotServiceImpl parkingSpotService;

    public ParkingSpotController(ParkingSpotServiceImpl parkingSpotService) {
        this.parkingSpotService = parkingSpotService;
    }


    @PostMapping
    public ResponseEntity<Object> saveParkingSpot(@RequestBody @Valid ParkingSpotDTO parkingSpotDTO) {
     var parkingSpotModel = new ParkingSpotModel();
     BeanUtils.copyProperties(parkingSpotDTO,parkingSpotModel);
     parkingSpotModel.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
     return ResponseEntity.status(HttpStatus.CREATED).body(parkingSpotService.save(parkingSpotModel));
    }


}
