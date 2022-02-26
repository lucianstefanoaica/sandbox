package com.hometech.sandbox.repositories;

import com.hometech.sandbox.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
