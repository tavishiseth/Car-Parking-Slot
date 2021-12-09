package com.sheryians.major.service;

import com.sheryians.major.model.Location;
import com.sheryians.major.model.ParkingSpace;
import com.sheryians.major.model.TimeSlot;
import com.sheryians.major.model.VehicleTypePrice;
import com.sheryians.major.repository.ParkingSpaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ParkingSpaceService {
    @Autowired
    ParkingSpaceRepository parkingSpaceRepository;

    public List<ParkingSpace> getAllPS(){
        return parkingSpaceRepository.findAll();
    }
    public void addPS(ParkingSpace parkingSpace){
        parkingSpaceRepository.save(parkingSpace);
    }
    public void  removePSById(long id){ parkingSpaceRepository.deleteById(id);}
    public Optional<ParkingSpace> getPSById(long id){ return parkingSpaceRepository.findById(id);}

    public List<ParkingSpace> getPSByLocationId(int id){
        return parkingSpaceRepository.findAllByLocation_Id(id);
    }

    public List<ParkingSpace> getPSByLocationId_Date_VehicleType(int id, Date date, VehicleTypePrice vehicleTypePrice){
        return parkingSpaceRepository.findAllByLocation_IdAndDateAndVehicleType(id,date,vehicleTypePrice);
    }
    public ParkingSpace getSinglePSById(long id){ return parkingSpaceRepository.getOne(id);}

}
