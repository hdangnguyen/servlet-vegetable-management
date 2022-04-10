/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author haida
 */
public class Cart {
    private Map<Integer, ProductDTO> cart;

    public Cart() {
    }

    public Cart(Map<Integer, ProductDTO> cart) {
        this.cart = cart;
    }

    public Map<Integer, ProductDTO> getCart() {
        return cart;
    }

    public void setCart(Map<Integer, ProductDTO> cart) {
        this.cart = cart;
    }
    
    public boolean add(ProductDTO product){
        boolean check = false;
        if(this.cart==null){
            this.cart = new HashMap<>();
        }
        if(this.cart.containsKey(product.getProductID())){
            int currentQuantity =1;
            currentQuantity = this.cart.get(product.getProductID()).getQuantity();
            product.setQuantity(currentQuantity+product.getQuantity());
        }
        cart.put(product.getProductID(), product);
        check = true;
        return check;
    }
    
    public boolean remove(int id){
        boolean check = false;
        if(this.cart!=null){
            if(this.cart.containsKey(id)){
                this.cart.remove(id);
                check=true;
            }
        }
        return check;
    }
    
    public boolean update(int productID, ProductDTO newProductID){
        boolean check = false;
        if(this.cart!=null){
            if(this.cart.containsKey(newProductID)){
                this.cart.replace(productID, newProductID);
                check=true;
            }
        }
        return check;
    }
    
}
