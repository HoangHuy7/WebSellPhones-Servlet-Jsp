package model;
// Generated Jun 7, 2022 11:30:50 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * TblBrand generated by hbm2java
 */
public class TblBrand  implements java.io.Serializable {


     private Integer brandId;
     private String name;
     private Set<TblProduct> tblProducts = new HashSet<TblProduct>(0);

    public TblBrand() {
    }

    public TblBrand(String name, Set<TblProduct> tblProducts) {
       this.name = name;
       this.tblProducts = tblProducts;
    }
   
    public Integer getBrandId() {
        return this.brandId;
    }
    
    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Set<TblProduct> getTblProducts() {
        return this.tblProducts;
    }
    
    public void setTblProducts(Set<TblProduct> tblProducts) {
        this.tblProducts = tblProducts;
    }




}


