package com.eshoppingstore.serv;

import com.eshoppingstore.model.Cart;

public interface CartService {

    Cart getCartById(int cartId);

    void update(Cart cart);
}
