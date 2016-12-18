package com.eshoppingstore.serv;

import com.eshoppingstore.model.CustomerOrder;

public interface CustomerOrderService {

    void addCustomerOrder(CustomerOrder customerOrder);

    double getCustomerOrderGrandTotal(int cartId);
}
