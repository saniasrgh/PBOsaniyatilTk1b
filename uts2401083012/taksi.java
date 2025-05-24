/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts2401083012;

/**
 *
 * @author FA506NF
 */
public class taksi extends mobil{
    private int tarifAwal;
    private int tarifPerKm;
    
    public taksi(){
        
    }
    public taksi(int tarifAwal, int tarifPerKm){
        this.tarifAwal = tarifAwal;
        this.tarifPerKm = tarifPerKm; 
    }
    
    public int gettarifAwal(){
        return this.tarifAwal;
    }
    public int gettarifPerKm(){
        return this.tarifPerKm;
    }
    public void settarifAwal(int tarifAwal){
        this.tarifAwal = tarifAwal;
    }
    public void settarifPerKm(int tarifPerKm){
        this.tarifPerKm = tarifPerKm;
    }
}
