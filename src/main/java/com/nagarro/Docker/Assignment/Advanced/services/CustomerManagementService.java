package com.nagarro.Docker.Assignment.Advanced.services;


import com.nagarro.Docker.Assignment.Advanced.beans.Customer;

import java.util.List;

public interface CustomerManagementService {

    Customer addCustomer(Customer customer);

    List<Customer> getAllCustomers();

    Customer getFirstCustomer();

    Customer getCustomerById(String customerId);

    Customer updateCustomer(String customerId, Customer customer);

    void deleteCustomerAndAccount(String customerId);


}
