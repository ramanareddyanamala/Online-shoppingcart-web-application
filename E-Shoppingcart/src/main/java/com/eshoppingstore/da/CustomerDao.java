package com.eshoppingstore.da;



import java.util.List;

import com.eshoppingstore.model.Customer;

public interface CustomerDao {

    void addCustomer(Customer customer);

    Customer getCustomerById(int customerId);

    List<Customer> getAllCustomers();

    Customer getCustomerByUsername(String username);
}
