package com.ticketbooking.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ticketbooking.entity.PassengerInfo;

@Repository
public interface PassengerRepo extends JpaRepository<PassengerInfo,Long>{

}
