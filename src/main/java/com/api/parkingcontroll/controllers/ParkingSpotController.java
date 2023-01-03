package com.api.parkingcontroll.controllers;


import com.api.parkingcontroll.services.ParkingSpotServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/parking-spot")
public class ParkingSpotController {

    final ParkingSpotServiceImpl parkingSpotService;

    public ParkingSpotController(ParkingSpotServiceImpl parkingSpotService) {
        this.parkingSpotService = parkingSpotService;
    }


}
