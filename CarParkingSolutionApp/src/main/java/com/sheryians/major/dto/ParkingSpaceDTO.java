package com.sheryians.major.dto;

import com.sheryians.major.model.Location;
import com.sheryians.major.model.TimeSlot;
import com.sheryians.major.model.VehicleTypePrice;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Data
public class ParkingSpaceDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    @Enumerated(EnumType.STRING)
    private VehicleTypePrice vehicleType; // has associated price with the vehicle type

    @Enumerated(EnumType.STRING)
    private TimeSlot timeslot;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date date;

    private boolean available; // whether the parking space is available or not
    private int locationId;

}