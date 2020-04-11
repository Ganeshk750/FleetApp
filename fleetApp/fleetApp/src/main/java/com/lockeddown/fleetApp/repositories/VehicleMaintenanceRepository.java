package com.lockeddown.fleetApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lockeddown.fleetApp.models.VehicleMaintenance;

@Repository
public interface VehicleMaintenanceRepository extends JpaRepository<VehicleMaintenance, Integer> {

}
