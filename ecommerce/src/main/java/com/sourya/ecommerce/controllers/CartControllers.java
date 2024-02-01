package com.sourya.ecommerce.controllers;

import com.sourya.api.CartApi;
import com.sourya.api.model.Cart;
import com.sourya.api.model.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

import java.util.Collections;
import java.util.List;

@RestController
public class CartControllers implements CartApi {
    private static final Logger log = LoggerFactory.getLogger(CartControllers.class);

    @Override
    public ResponseEntity<List<Item>> addCartItemsByCustomerId(String customerId, @Valid Item item){
    	log.info("Request for customer ID: {}\nItem: {}", customerId, item);
    	return ok(Collections.EMPTY_LIST);
    
    }
    
    @Override
    public ResponseEntity<List<Item>> addOrReplaceItemsByCustomerId(String customerId, @Valid Item item){
    	return null;
    }
    
    @Override
    public ResponseEntity<Void> deleteCart(String customerId){
    	return null;
    }
    
    @Override
    public ResponseEntity<Void> deleteItemFromCart(String customerId, String itemId){
    	return null;
    }
    
    @Override
    public ResponseEntity<List<Cart>> getCartByCustomerId(String customerId){
    	throw new RuntimeException("Manual Exception Thrown");
    }

    @Override
    public ResponseEntity<List<Item>> getCartItemsByCustomerId(String customerId){
        return null;
    }

    @Override
    public ResponseEntity<List<Item>> getCartItemsByItemId(String customerId, String itemId){
        return null;
    }
    
    

}
