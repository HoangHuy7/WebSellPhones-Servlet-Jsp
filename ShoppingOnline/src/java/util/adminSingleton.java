/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.List;
import model.TblBrand;
import model.TblProduct;
import model.TblProductcategory;
import model.TblSupplier;
import service.BrandService;
import service.CategoryService;
import service.ProductService;
import service.SupplierService;

/**
 *
 * @author LENOVO
 */
public class adminSingleton {

    private static adminSingleton allData = null;

    private List<TblProduct> listProductA = null;
    private List<TblProductcategory> listCateA = null;
    private List<TblBrand> listBrandA = null;
    private List<TblSupplier> listSupplierA = null;

    private adminSingleton(ProductService prodService, CategoryService cateSerice, BrandService brandService, SupplierService supplierService) {
        listProductA = prodService.findAll();
        listCateA = cateSerice.findAll();
        listBrandA = brandService.findAll();
        listSupplierA = supplierService.findAll();
    }

    // Static method
    // Static method to create instance of Singleton class
    public static adminSingleton getInstance(ProductService prodService, CategoryService cateSerice, BrandService brandService, SupplierService supplierService) {
        if (allData == null) {
            allData = new adminSingleton(prodService, cateSerice, brandService, supplierService);
        }
        return allData;
    }
    
    public static adminSingleton getAllData() {
        return allData;
    }

    public List<TblProduct> getListProductA() {
        return listProductA;
    }

    public void setListProductA(List<TblProduct> listProductA) {
        this.listProductA = listProductA;
    }

    public List<TblProductcategory> getListCateA() {
        return listCateA;
    }

    public void setListCateA(List<TblProductcategory> listCateA) {
        this.listCateA = listCateA;
    }

    public List<TblBrand> getListBrandA() {
        return listBrandA;
    }

    public void setListBrandA(List<TblBrand> listBrandA) {
        this.listBrandA = listBrandA;
    }

    public List<TblSupplier> getListSupplierA() {
        return listSupplierA;
    }

    public void setListSupplierA(List<TblSupplier> listSupplierA) {
        this.listSupplierA = listSupplierA;
    }

    
}
