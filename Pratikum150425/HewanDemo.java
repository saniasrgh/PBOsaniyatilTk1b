/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pratikum150425;

/**
 *
 * @author FA506NF
 */
public class HewanDemo {

    
    public static void main(String[] args) {
        //buat objek
        Hewan hewanumum = new Hewan ("Makhluk Hidup");
        Kucing kucingku = new Kucing ("Bobby");
        Anjing anjingku = new Anjing ("Timmy");
        
        hewanumum.tampilkanNama();
        hewanumum.Suara();
        
        System.out.println();
        
        kucingku.tampilkanNama();
        kucingku.Suara();
        
        System.out.println();
        
        anjingku.tampilkanNama();
        anjingku.Suara();
        System.out.println();
        
    }
    
}
