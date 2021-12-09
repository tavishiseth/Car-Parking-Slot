package com.sheryians.major.model;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data

public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "location_id")
    private int id;

    private String name;
    private String address;


}


