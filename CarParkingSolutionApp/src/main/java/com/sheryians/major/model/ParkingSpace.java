package com.sheryians.major.model;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.format.annotation.DateTimeFormat;
import org.apache.commons.lang3.time.DateFormatUtils;
import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.*;

@DynamicUpdate
@Data
@Entity
public class ParkingSpace {
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

    public String dateFormat(){
       return DateFormatUtils.format(this.date, "dd-MM-yyyy");
    }

    private boolean available; // whether the parking space is available or not

    public String availableToString(){
        if(this.available) return "Yes";
        else return "No";
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id",referencedColumnName = "location_id")
    private Location location;

    public int getPrice(){
        return this.vehicleType.getPrice();
    }
    public String toStringLocation(){

        return (this.location.getName()).toString();
    }


}
