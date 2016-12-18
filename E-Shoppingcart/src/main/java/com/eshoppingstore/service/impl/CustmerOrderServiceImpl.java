package com.eshoppingstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eshoppingstore.da.CustomerOrderDao;
import com.eshoppingstore.model.Cart;
import com.eshoppingstore.model.CartItem;
import com.eshoppingstore.model.CustomerOrder;
import com.eshoppingstore.serv.CartService;
import com.eshoppingstore.serv.CustomerOrderService;

import java.util.List;

@Service
public class CustmerOrderServiceImpl implements CustomerOrderService{

    @Autowired
    private CustomerOrderDao customerOrderDao;

    @Autowired
    private CartService cartService;

    public void addCustomerOrder(CustomerOrder customerOrder){
        customerOrderDao.addCustomerOrder(customerOrder);
    }

    public double getCustomerOrderGrandTotal(int cartId){
        double grandTotal = 0;
        Cart cart = cartService.getCartById(cartId);
        List<CartItem> cartItems = cart.getCartItems();

        for (CartItem item : cartItems){
            grandTotal += item.getTotalPrice();
        }

        return grandTotal;
    }

} // The End of Class;
