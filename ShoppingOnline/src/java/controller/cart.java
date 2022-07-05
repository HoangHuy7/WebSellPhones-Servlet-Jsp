/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.HashMap;

/**
 *
 * @author LENOVO
 */
public class cart extends HashMap<Integer, cartItem> {

    public cart() {
    }
    
    public boolean addToCard(cartItem c) {
        
        if (c.getProduct().getQuantity() <= 0) {
            return false;
        }
        try {
            int key = c.getProduct().getProductId();
            if (this.containsKey(key)) {
                int quantityOld = this.get(key).getQuantity();
                this.get(key).setQuantity(quantityOld + c.getQuantity());
            } else {
                this.put(key, c);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean removeProduct(int key) {

        
        boolean iflag = false;
        try {

            if (this.containsKey(key)) {
                this.remove(key);
                iflag = true;
            } else {
                iflag = false;
            }
            return iflag;
        } catch (Exception e) {
            return iflag;
        }
    }

    public boolean updateQuantity(int key, int quantity) {
        boolean iflag = false;
        try {

            if (this.containsKey(key)) {
                if (quantity == 0) {
                    this.remove(key);
                } else {
                    cartItem c = this.get(key);
                    int quantityOld = c.getQuantity();
                    this.get(key).setQuantity(quantityOld + c.getQuantity());

                }
                iflag = true;
            } else {
                iflag = false;
            }
            return iflag;
        } catch (Exception e) {
            return iflag;
        }
    }
}
