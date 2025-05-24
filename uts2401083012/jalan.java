/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts2401083012;

/**
 *
 * @author FA506NF
 */

import java.util.Scanner;
public class jalan {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        taksi t = new taksi();
        t.setjmlRoda(4);
        t.settarifAwal(15000);
        t.settarifPerKm(7000);
        
        
        System.out.print("Masukkan warna: ");
        t.setwarna(input.nextLine());
        System.out.print("Masukkan jenis bahan bakar: ");
        t.setbahanBakar(input.nextLine());
        System.out.print("Masukkan jumlah kapasitas mesin : ");
        t.setkapasitasMesin(input.nextInt());
        
        System.out.println("UTS SANIYATIL WADA'I SARAGIH");
        System.out.println("2401083012");
        System.out.println("Soal Group A");
        System.out.println("--------------------------------");
        System.out.println("Taksi Yeager");
        System.out.println("Jumlah Roda : " + t.getjmlRoda());
        System.out.println("Warna taksi : " + t.getwarna());
        System.out.println("Jenis bahan bakar : " + t.getbahanBakar());
        System.out.println("Jumlah kapasitas mesin : " + t.getkapasitasMesin()+ " cc");
        System.out.println("Tarif Awal : Rp "+ t.gettarifAwal());
        System.out.println("Tarif Per Km : Rp "+ t.gettarifPerKm());
    }
    
}
