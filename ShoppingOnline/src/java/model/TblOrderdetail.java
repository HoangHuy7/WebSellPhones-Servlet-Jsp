package model;
// Generated May 31, 2022 1:13:33 AM by Hibernate Tools 4.3.1



/**
 * TblOrderdetail generated by hbm2java
 */
public class TblOrderdetail  implements java.io.Serializable {


     private Integer idProduct;
     private TblOrder tblOrder;
     private TblProduct tblProduct;
     private int productName;
     private int quantity;
     private int price;

    public TblOrderdetail() {
    }

    public TblOrderdetail(TblOrder tblOrder, TblProduct tblProduct, int productName, int quantity, int price) {
       this.tblOrder = tblOrder;
       this.tblProduct = tblProduct;
       this.productName = productName;
       this.quantity = quantity;
       this.price = price;
    }
   
    public Integer getIdProduct() {
        return this.idProduct;
    }
    
    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }
    public TblOrder getTblOrder() {
        return this.tblOrder;
    }
    
    public void setTblOrder(TblOrder tblOrder) {
        this.tblOrder = tblOrder;
    }
    public TblProduct getTblProduct() {
        return this.tblProduct;
    }
    
    public void setTblProduct(TblProduct tblProduct) {
        this.tblProduct = tblProduct;
    }
    public int getProductName() {
        return this.productName;
    }
    
    public void setProductName(int productName) {
        this.productName = productName;
    }
    public int getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getPrice() {
        return this.price;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }




}


