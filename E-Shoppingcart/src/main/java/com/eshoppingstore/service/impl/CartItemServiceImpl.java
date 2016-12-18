package com.eshoppingstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eshoppingstore.da.CartItemDao;
import com.eshoppingstore.model.Cart;
import com.eshoppingstore.model.CartItem;
import com.eshoppingstore.serv.CartItemService;

@Service
public class CartItemServiceImpl implements CartItemService{

    @Autowired
    private CartItemDao cartItemDao;

    public void addCartItem(CartItem cartItem){
        cartItemDao.addCartItem(cartItem);
    }

    public void removeCartItem(CartItem cartItem){
        cartItemDao.removeCartItem(cartItem);
    }

    public void removeAllCartItems(Cart cart){
        cartItemDao.removeAllCartItems(cart);
    }

    public CartItem getCartItemByProductId(int productId){
        return cartItemDao.getCartItemByProductId(productId);
    }

} // The End of Class;
