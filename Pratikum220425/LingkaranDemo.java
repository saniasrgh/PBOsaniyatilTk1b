/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pratikum220425;

/**
 *
 * @author FA506NF
 */
import java.util.Scanner;
public class LingkaranDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //input lingkaran
        System.out.print("Masukkan jari - jari : ");
        double r = input.nextDouble();
        Lingkaran lingkaran = new Lingkaran(r);
        System.out.print("--Inpo Lingkaran--\n");
        System.out.println(lingkaran);
        System.out.println("Luas: " + lingkaran.getLuas());
        System.out.println("Keliling: " + lingkaran.getKeliling());
     
        //input kerucut
        System.out.print("\nMasukkan tinggi kerucut: ");
        double t1 = input.nextDouble();
        Kerucut kerucut = new Kerucut(r, t1);
        System.out.print("--Inpo Kerucut--\n");
        System.out.println(kerucut);
        System.out.println("Volume Kerucut: " + kerucut.getVolume());
        System.out.println("Luas Permukaan Kerucut: " + kerucut.getLuas());
        
        System.out.print("\nMasukkan tinggi silinder : ");
        double t2 = input.nextDouble();
        Silinder silinder = new Silinder(r, t2);
        System.out.println("\n-- Info Silinder --");
        System.out.println(silinder);
        System.out.printf("\nVolume    : "+silinder.getVolume());
        System.out.printf("\nLuas Permukaan : "+ silinder.getLuas());

        input.close();
        
    }
    
}