/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts2401083012;

/**
 *
 * @author FA506NF
 */

//soal group A
public class kendaraan {
    protected int jmlRoda;
    private String warna;
    
    public kendaraan(){
        
    }
    public kendaraan(int jmlRoda, String warna){
        this.jmlRoda = jmlRoda;
        this.warna = warna;
    }
    public int getjmlRoda(){
        return this.jmlRoda;
    }
    public void setjmlRoda(int jmlRoda){
        this.jmlRoda = jmlRoda;
    }
    public String getwarna(){
        return this.warna;
    }
    public void setwarna(String warna){
        this.warna = warna;
    }

}