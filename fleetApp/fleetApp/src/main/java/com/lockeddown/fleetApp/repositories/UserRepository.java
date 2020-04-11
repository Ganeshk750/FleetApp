package com.lockeddown.fleetApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lockeddown.fleetApp.models.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUsername(String username);
}
