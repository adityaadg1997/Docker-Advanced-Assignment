package com.nagarro.Docker.Assignment.Advanced.repository;

import com.nagarro.Docker.Assignment.Advanced.beans.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {

    // Custom query method to get the first record
    Customer findTopByOrderByCustomerId();

}
