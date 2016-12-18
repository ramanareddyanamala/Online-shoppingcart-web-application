package com.eshoppingstore.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eshoppingstore.da.CartDao;
import com.eshoppingstore.model.Cart;
import com.eshoppingstore.serv.CartService;


@Service
public class CartServiceImpl implements CartService{

    @Autowired
    private CartDao cartDao;

    public Cart getCartById(int cartId){
        return cartDao.getCartById(cartId);
    }

    public void update(Cart cart){
        cartDao.update(cart);
    }

} // The End of Class;
