/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.TblProduct;

/**
 *
 * @author LENOVO
 */
public class cartItem {
    
    private TblProduct product;
    private int quantity;

    public cartItem(TblProduct product) {
        this.product = product;
        this.quantity = 1;
    }

    public cartItem(TblProduct product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public cartItem() {
    }

    public TblProduct getProduct() {
        return product;
    }

    public void setProduct(TblProduct product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
}
