package com.api.parkingcontroll.services;

import com.api.parkingcontroll.models.ParkingSpotModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class ParkingSpotServiceImplV2 implements ParkingSpotService {


    @Override
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
        return null;
    }

    @Override
    public boolean existsByLicensePlateCar(String licensePlateCar) {
        return false;
    }

    @Override
    public boolean existsByParkingSpotNumber(String parkingSpotNumber) {
        return false;
    }

    @Override
    public boolean existsByApartamentAndBlock(String apartment, String block) {
        return false;
    }

    @Override
    public Page<ParkingSpotModel> getAll(Pageable pageable) {
        return null;
    }

    @Override
    public Optional<ParkingSpotModel> findById(UUID id) {
        return Optional.empty();
    }

    @Override
    public void deleteOneParkingSpot(ParkingSpotModel parkingSpotModel) {

    }
}
