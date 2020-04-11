package com.lockeddown.fleetApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lockeddown.fleetApp.models.Country;


@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
