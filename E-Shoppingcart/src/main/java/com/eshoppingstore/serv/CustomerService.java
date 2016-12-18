package com.eshoppingstore.serv;




import java.util.List;

import com.eshoppingstore.model.Customer;

public interface CustomerService {

    void addCustomer(Customer customer);

    Customer getCustomerById(int customerId);

    List<Customer> getAllCustomers();

    Customer getCustomerByUsername(String username);

}
