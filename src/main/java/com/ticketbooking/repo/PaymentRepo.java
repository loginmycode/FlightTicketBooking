package com.ticketbooking.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ticketbooking.entity.PaymentInfo;

@Repository
public interface PaymentRepo extends JpaRepository<PaymentInfo, String> {

}
