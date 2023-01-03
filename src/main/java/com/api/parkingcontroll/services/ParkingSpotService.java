package com.api.parkingcontroll.services;

import com.api.parkingcontroll.models.ParkingSpotModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ParkingSpotService {

  ParkingSpotModel save(ParkingSpotModel parkingSpotModel);

  boolean existsByLicensePlateCar(String licensePlateCar);

  boolean existsByParkingSpotNumber(String parkingSpotNumber);

  boolean existsByApartamentAndBlock(String apartment, String block);

  Page<ParkingSpotModel> getAll(Pageable pageable);

    Optional<ParkingSpotModel> findById(UUID id);


  void deleteOneParkingSpot(ParkingSpotModel parkingSpotModel);
}
