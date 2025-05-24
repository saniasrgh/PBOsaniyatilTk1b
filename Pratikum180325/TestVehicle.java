/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pratikum180325;

/**
 *
 * @author FA506NF
 */
public class TestVehicle {
    public static void main(String[] args) {
        //buat vehicle dengan beban maksimal 10.000kg
        System.out.println("Kendaraan 1. Beban maksimal 10.000kg");
        Vehicle kendaraan1 = new Vehicle(10000);
        
        //menambahkan bbrp beban (load)
        System.out.println("Menambahkan beban 1 (500kg)");
        kendaraan1.load = kendaraan1.load + 500;
        System.out.println("Menambahkan beban 2 (250kg)");
        kendaraan1.load = kendaraan1.load + 250;
        System.out.println("Menambahkan beban 3 (5000kg)");
        kendaraan1.load = kendaraan1.load + 5000;
        System.out.println("Menambahkan beban 4 (4000kg)");
        kendaraan1.load = kendaraan1.load + 4000;
        System.out.println("Menambahkan beban 5 (350kg)");
        kendaraan1.load = kendaraan1.load + 350;
        
        //menampilkan beban(load) kendaraan saat ini
        System.out.println("Beban kendaraan saat ini = "+kendaraan1.getLoad()+" kg");
        
    }
    
}
