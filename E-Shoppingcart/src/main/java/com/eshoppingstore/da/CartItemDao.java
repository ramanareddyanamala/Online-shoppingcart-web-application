package com.eshoppingstore.da;

import com.eshoppingstore.model.Cart;
import com.eshoppingstore.model.CartItem;

public interface CartItemDao {

    void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItems(Cart cart);

    CartItem getCartItemByProductId(int productId);
}
