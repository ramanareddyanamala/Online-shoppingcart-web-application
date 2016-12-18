package com.eshoppingstore.serv;

import com.eshoppingstore.model.Cart;
import com.eshoppingstore.model.CartItem;

public interface CartItemService {

    void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItems(Cart cart);

    CartItem getCartItemByProductId(int productId);

}
