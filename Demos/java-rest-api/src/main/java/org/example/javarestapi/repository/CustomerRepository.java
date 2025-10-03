package org.example.javarestapi.repository;

import org.example.javarestapi.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

// @Repository // Optional now
public interface CustomerRepository extends JpaRepository<Customer, String> {
}
