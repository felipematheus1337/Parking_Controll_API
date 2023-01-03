package com.api.parkingcontroll.services;


import com.api.parkingcontroll.repositories.ParkingSpotRepository;
import org.springframework.stereotype.Service;

@Service
public class ParkingSpotServiceImpl implements ParkingSpotService{

    final ParkingSpotRepository parkingSpotRepository;


    public ParkingSpotServiceImpl(ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }



}
