package com.example.demo.service;

import com.example.demo.model.Cart;
import com.example.demo.model.CartItem;
import com.example.demo.model.Product;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class CartService {
    private final HashMap<String, Cart> userCarts = new HashMap<>();

    public void addToCart(String sessionId, Product product) {
        Cart cart = userCarts.computeIfAbsent(sessionId, k -> new Cart());
        cart.addItem(product);
    }

    public List<CartItem> getCartItems(String sessionId) {
        return userCarts.getOrDefault(sessionId, new Cart()).getItems();
    }
}
