/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pratikum270225;

import java.util.Scanner;

/**
 *
 * @author FA506NF
 */
public class Perulangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,i;
        Scanner in = new Scanner(System.in);
        System.out.println("===Program Pengulangan===");
        System.out.print("Masukkan banyak pengulangan : ");
        n= in.nextInt();
        System.out.println("---Perulangan For---");
        for(i=1;i<=n;i++)
            System.out.print(i+"\t");
        
        System.out.println("\n--Pengulangan While--");
        i=1;
        while(i<=n){
            System.out.print(i+"\t");
            i++;
        }
        
        System.out.println("\n--Pengulangan Do-WHile--");
        i=1;
        do{
            System.out.print(i+"\t");
            i++;
        }while (i<=n);
    }
    
}