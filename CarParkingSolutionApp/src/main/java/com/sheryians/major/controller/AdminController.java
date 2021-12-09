package com.sheryians.major.controller;

import com.sheryians.major.dto.ParkingSpaceDTO;
import com.sheryians.major.model.Category;
import com.sheryians.major.model.Location;
import com.sheryians.major.model.ParkingSpace;
import com.sheryians.major.service.CategoryService;
import com.sheryians.major.service.LocationService;
import com.sheryians.major.service.ParkingSpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class AdminController {
    //Worker Section---------------------------------------------------------->
    @Autowired
    CategoryService categoryService;
    @GetMapping("/admin")
    public String adminHome(){
        return "adminHome";
    }
    @GetMapping("/admin/categories")
    public String getCat(Model model){
        model.addAttribute("categories", categoryService.getAllCategory());
        return "categories";
    }
    @GetMapping("/admin/categories/add")
    public String getCatAdd(Model model){
        model.addAttribute("category", new Category());
        return "categoriesAdd";
    }
    @PostMapping("/admin/categories/add")
    public String postCatAdd(@ModelAttribute("category") Category category){
        categoryService.addCategory(category);
        return "redirect:/admin/categories";
    }
    @GetMapping("/admin/categories/delete/{id}")
    public String deleteCat(@PathVariable int id){
        categoryService.removeCategoryById(id);
        return "redirect:/admin/categories";
    }
    @GetMapping("/admin/categories/update/{id}")
    public String updateCat(@PathVariable int id, Model model){
        Optional<Category> category = categoryService.getCategoryById(id);
        if(category.isPresent()){
            model.addAttribute("category", category.get());
            return "categoriesAdd";
        }
       else
           return "404";
    }

    //Location Section---------------------------------------------------------->
    @Autowired
    LocationService locationService;

    @GetMapping("/admin/locations")
    public String getLoc(Model model){
        model.addAttribute("location",locationService.getAllLocation());
        return "locations";
    }
    @GetMapping("/admin/locations/add")
    public String getLocAdd(Model model){
        model.addAttribute("location", new Location());
        return "locationAdd";
    }
    @PostMapping("/admin/locations/add")
    public String postLocAdd(@ModelAttribute("location") Location location){
        locationService.addLocation(location);
        return "redirect:/admin/locations";
    }
    @GetMapping("/admin/locations/delete/{id}")
    public String deleteLoc(@PathVariable int id){
        locationService.removeLocationById(id);
        return "redirect:/admin/locations";
    }
    @GetMapping("/admin/locations/update/{id}")
    public String updateLoc(@PathVariable int id, Model model){
        Optional<Location> location = locationService.getLocationById(id);
        if(location.isPresent()){
            model.addAttribute("location", location.get());
            return "locationAdd";
        }
        else
            return "404";
    }

    //ParkingSpace Section---------------------------------------------------------->
    @Autowired
    ParkingSpaceService parkingSpaceService;

    @GetMapping("/admin/PS")
    public String getPS(Model model){
        model.addAttribute("parkingSpace",parkingSpaceService.getAllPS());
        return "PS";
    }

    @GetMapping("/admin/PS/add")
    public String getPSAdd(Model model){
        model.addAttribute("parkingSpaceDTO",new ParkingSpaceDTO());
        model.addAttribute("locations",locationService.getAllLocation());
        return "PSAdd";
    }

    @PostMapping("/admin/PS/add")
    public String PSAddPost(@ModelAttribute("parkingSpaceDTO") ParkingSpaceDTO parkingSpaceDTO){
        ParkingSpace parkingSpace = new ParkingSpace();
        parkingSpace.setId(parkingSpaceDTO.getId());
        parkingSpace.setName(parkingSpaceDTO.getName());
        parkingSpace.setLocation(locationService.getLocationById(parkingSpaceDTO.getLocationId()).get());
        parkingSpace.setVehicleType(parkingSpaceDTO.getVehicleType());
        parkingSpace.setTimeslot(parkingSpaceDTO.getTimeslot());
        parkingSpace.setDate(parkingSpaceDTO.getDate());
        parkingSpace.setAvailable(parkingSpaceDTO.isAvailable());

        parkingSpaceService.addPS(parkingSpace);
        return "redirect:/admin/PS";
    }

    @GetMapping("/admin/PS/delete/{id}")
    public String deletePS(@PathVariable int id){
        parkingSpaceService.removePSById(id);
        return "redirect:/admin/PS";
    }
    @GetMapping("/admin/PS/update/{id}")
    public String updatePS(@PathVariable long id, Model model){
        ParkingSpace parkingSpace = parkingSpaceService.getPSById(id).get();
        ParkingSpaceDTO parkingSpaceDTO = new ParkingSpaceDTO();

        parkingSpaceDTO.setId(parkingSpace.getId());
        parkingSpaceDTO.setName(parkingSpace.getName());
        parkingSpaceDTO.setLocationId((parkingSpace.getLocation()).getId());
        parkingSpaceDTO.setVehicleType(parkingSpace.getVehicleType());
        parkingSpaceDTO.setTimeslot(parkingSpace.getTimeslot());
        parkingSpaceDTO.setDate(parkingSpace.getDate());
        parkingSpaceDTO.setAvailable(parkingSpace.isAvailable());

        model.addAttribute("locations", locationService.getAllLocation());
        model.addAttribute("parkingSpaceDTO", parkingSpaceDTO);
        return "PSAdd";

    }
}
