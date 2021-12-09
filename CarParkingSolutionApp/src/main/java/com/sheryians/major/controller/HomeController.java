package com.sheryians.major.controller;

import com.sheryians.major.global.GlobalData;
import com.sheryians.major.model.ParkingSpace;
import com.sheryians.major.model.TimeSlot;
import com.sheryians.major.model.VehicleTypePrice;
import com.sheryians.major.service.CategoryService;
import com.sheryians.major.service.LocationService;
import com.sheryians.major.service.ParkingSpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @Autowired
    LocationService locationService;
    @Autowired
    ParkingSpaceService parkingSpaceService;

    @GetMapping({"/","/home"})
    public String home(Model model){
        model.addAttribute("cartCount", GlobalData.cart.size());
        return "index";
    }

    @GetMapping("/shop")
    public String shop(Model model){
        model.addAttribute("locations", locationService.getAllLocation());
        model.addAttribute("parkingSpaces", parkingSpaceService.getAllPS());
        model.addAttribute("cartCount", GlobalData.cart.size());
        //model.addAttribute("PS" ,new ParkingSpace());
        return "shop";
    }

    //ParkingSpace parkingSpace = new ParkingSpace();
    @GetMapping("/shop/locations/{id}")
    public String shopByLocation(Model model, @PathVariable int id){
        model.addAttribute("locations", locationService.getAllLocation());
        model.addAttribute("parkingSpaces", parkingSpaceService.getPSByLocationId(id));
        model.addAttribute("cartCount", GlobalData.cart.size());
        return "shop";
    }

    @GetMapping("/shop/viewPS/{id}")
    public String viewPS(Model model, @PathVariable int id){
        model.addAttribute("PS", parkingSpaceService.getPSById(id).get());
        return "viewPS";
    }


}
