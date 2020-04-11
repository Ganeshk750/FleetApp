package com.lockeddown.fleetApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lockeddown.fleetApp.models.Contact;



@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
