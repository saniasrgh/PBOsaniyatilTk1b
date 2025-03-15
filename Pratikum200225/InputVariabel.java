/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum200225;

/**
 *
 * @author LAB-MM
 */

import java.util.Scanner;
        
        
public class InputVariabel {
    public static void main(String [] args){
        String nama;
        int umur;
        char jk;
        float rapor;
        boolean asal;
        Scanner input = new Scanner(System.in);
        System.out.println("== Program Input Variabel==");
        System.out.print("Nama anda = ");
        nama = input.nextLine();
        System.out.print("Umur anda = ");
        umur = input.nextInt(); //baca integer
        System.out.print("Gendaer (L/P) = ");
        jk = input.next().charAt (0); //baca karakter
        System.out.print("Rata-rata rapor = ");
        rapor = input.nextFloat(); //baca float
        System.out.print("Asal padang (true/false)? ");
        asal = input.nextBoolean(); //baca boolean
        System.out.println("\n== Input Data Anda==");
        System.out.println("Nama anda = "+nama);
        System.out.println("Umur anda = "+umur+" tahun");
        System.out.println("Gender anda = "+jk);
        System.out.println("Rata-rata rapor = "+rapor);
        if(asal) //asal = true
            System.out.println("Anda berasal dari Padang ");
        else //asal = false
            System.out.println("Anda bukan berasal dari Padang");
        //end if
    }
}
