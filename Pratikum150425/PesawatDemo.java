/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pratikum150425;

/**
 *
 * @author FA506NF
 */
public class PesawatDemo {

    
    public static void main(String[] args) {
        Pesawat p = new Pesawat ("Lion Air", 2010, true, 120);
        p.cetak();
        
        System.out.println("_______________");
        System.out.println("Setelah reset");
        p.reset("Airbus", 2020, false, 200);
        p.cetak();
    }
    
}
