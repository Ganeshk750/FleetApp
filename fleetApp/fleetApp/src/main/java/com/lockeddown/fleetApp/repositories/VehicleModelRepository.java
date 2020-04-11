package com.lockeddown.fleetApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lockeddown.fleetApp.models.VehicleModel;


@Repository
public interface VehicleModelRepository extends JpaRepository<VehicleModel, Integer> {

}
