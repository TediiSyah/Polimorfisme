/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfisme;

/**
 *
 * @author Tedii
 */   
    public class segitiga extends BangunDatar{
    
    int alas;
    int tinggi;
    
    public segitiga (int alas,int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    @Override
    public float luas(){
        return this.alas * this.tinggi;
}
    }
