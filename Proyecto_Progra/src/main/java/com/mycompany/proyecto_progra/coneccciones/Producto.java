/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_progra.coneccciones;

/**
 *
 * @author GAMING
 */
public class Producto {
    
    private int code;
    private String product;
    private String uom;
    private int quantity;
    private double price;
    private double amount;
    
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    
    public String getProduct(){
        return product;
    }
    public void setProduct(String product){
        this.product = product;
    }
    
    public String getuom(){
        return uom;
    }
    public void setuom(String uom){
        this.uom = uom;
    }
    
    public int getquantity() {
        return quantity;
    }
    public void setquantity(int quantity) {
        this.quantity = quantity;
    }
    
    public double getprice() {
        return price;
    }
    public void setprice(double price) {
        this.price = price;
    }
    
    public double getamount() {
        return amount;
    }
    public void setamount(int amount) {
        this.amount = amount;
    }
}
