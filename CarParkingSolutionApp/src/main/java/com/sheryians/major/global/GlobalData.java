package com.sheryians.major.global;

import com.sheryians.major.model.ParkingSpace;

import java.util.ArrayList;
import java.util.List;

public class GlobalData {
    public static List<ParkingSpace> cart;
    static {
        cart = new ArrayList<ParkingSpace>();
    }
}
