package com.sheryians.major.repository;

import com.sheryians.major.model.Category;
import com.sheryians.major.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
