package com.sheryians.major.repository;

import com.sheryians.major.model.ParkingSpace;
import com.sheryians.major.model.TimeSlot;
import com.sheryians.major.model.VehicleTypePrice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface ParkingSpaceRepository extends JpaRepository<ParkingSpace,Long> {
    List<ParkingSpace> findAllByLocation_Id(int id);
    List<ParkingSpace> findAllByLocation_IdAndDateAndVehicleType(int id, Date date, VehicleTypePrice vehicleTypePrice);
}
