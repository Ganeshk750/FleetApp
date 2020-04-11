package com.lockeddown.fleetApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lockeddown.fleetApp.models.JobTitle;


@Repository
public interface JobTitleRepository extends JpaRepository<JobTitle, Integer> {

}
