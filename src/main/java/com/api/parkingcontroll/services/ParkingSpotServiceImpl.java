package com.api.parkingcontroll.services;


import com.api.parkingcontroll.models.ParkingSpotModel;
import com.api.parkingcontroll.repositories.ParkingSpotRepository;
import jakarta.transaction.Transactional;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;




import java.util.Optional;
import java.util.UUID;

@Service
@Primary
public class ParkingSpotServiceImpl implements ParkingSpotService{

    final ParkingSpotRepository parkingSpotRepository;


    public ParkingSpotServiceImpl(ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }


    @Transactional
    @Override
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
        return parkingSpotRepository.save(parkingSpotModel);
    }

    @Override
    public boolean existsByLicensePlateCar(String licensePlateCar) {
        return parkingSpotRepository.existsByLicensePlateCar(licensePlateCar);
    }

    @Override
    public boolean existsByParkingSpotNumber(String parkingSpotNumber) {
        return parkingSpotRepository.existsByParkingSpotNumber(parkingSpotNumber);
    }

    @Override
    public boolean existsByApartamentAndBlock(String apartment, String block) {
        return parkingSpotRepository.existsByApartmentAndBlock(apartment,block);
    }


    public Page<ParkingSpotModel> getAll(Pageable pageable) {
        return parkingSpotRepository.findAll(pageable);
    }

    @Override
    public Optional<ParkingSpotModel> findById(UUID id) {
        return parkingSpotRepository.findById(id);
    }

    @Transactional
    @Override
    public void deleteOneParkingSpot(ParkingSpotModel parkingSpotModel) {
        parkingSpotRepository.delete(parkingSpotModel);
    }



}
