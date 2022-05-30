package model;
// Generated May 31, 2022 1:13:33 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * TblOrder generated by hbm2java
 */
public class TblOrder  implements java.io.Serializable {


     private Integer orderId;
     private TblUser tblUser;
     private int orderDate;
     private int status;
     private byte delivered;
     private int deliveryDate;
     private Integer discount;
     private long total;
     private Set<TblOrderdetail> tblOrderdetails = new HashSet<TblOrderdetail>(0);

    public TblOrder() {
    }

	
    public TblOrder(TblUser tblUser, int orderDate, int status, byte delivered, int deliveryDate, long total) {
        this.tblUser = tblUser;
        this.orderDate = orderDate;
        this.status = status;
        this.delivered = delivered;
        this.deliveryDate = deliveryDate;
        this.total = total;
    }
    public TblOrder(TblUser tblUser, int orderDate, int status, byte delivered, int deliveryDate, Integer discount, long total, Set<TblOrderdetail> tblOrderdetails) {
       this.tblUser = tblUser;
       this.orderDate = orderDate;
       this.status = status;
       this.delivered = delivered;
       this.deliveryDate = deliveryDate;
       this.discount = discount;
       this.total = total;
       this.tblOrderdetails = tblOrderdetails;
    }
   
    public Integer getOrderId() {
        return this.orderId;
    }
    
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
    public TblUser getTblUser() {
        return this.tblUser;
    }
    
    public void setTblUser(TblUser tblUser) {
        this.tblUser = tblUser;
    }
    public int getOrderDate() {
        return this.orderDate;
    }
    
    public void setOrderDate(int orderDate) {
        this.orderDate = orderDate;
    }
    public int getStatus() {
        return this.status;
    }
    
    public void setStatus(int status) {
        this.status = status;
    }
    public byte getDelivered() {
        return this.delivered;
    }
    
    public void setDelivered(byte delivered) {
        this.delivered = delivered;
    }
    public int getDeliveryDate() {
        return this.deliveryDate;
    }
    
    public void setDeliveryDate(int deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
    public Integer getDiscount() {
        return this.discount;
    }
    
    public void setDiscount(Integer discount) {
        this.discount = discount;
    }
    public long getTotal() {
        return this.total;
    }
    
    public void setTotal(long total) {
        this.total = total;
    }
    public Set<TblOrderdetail> getTblOrderdetails() {
        return this.tblOrderdetails;
    }
    
    public void setTblOrderdetails(Set<TblOrderdetail> tblOrderdetails) {
        this.tblOrderdetails = tblOrderdetails;
    }




}


