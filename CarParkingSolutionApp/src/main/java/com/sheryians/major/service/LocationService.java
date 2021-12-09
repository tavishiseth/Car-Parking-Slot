package com.sheryians.major.service;
import com.sheryians.major.model.Location;
import com.sheryians.major.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationService {
    @Autowired
    LocationRepository locationRepository;
    public List<Location> getAllLocation(){
        return locationRepository.findAll();
    }
    public void addLocation(Location location){ locationRepository.save(location);
    }
    public void  removeLocationById(int id){ locationRepository.deleteById(id);}
    public Optional<Location> getLocationById(int id){ return locationRepository.findById(id);}
}
