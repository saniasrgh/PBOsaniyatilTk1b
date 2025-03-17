/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pratikum040325;

/**
 *
 * @author FA506NF
 */
import java.util.Scanner;
public class Perulangan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,j,n;
        Scanner in = new Scanner(System.in);
        
        System.out.println("== 1 == ");
        System.out.print("Masukkan Nilai n = ");
        n=in.nextInt();
        
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
        int k;
        System.out.println("\n== 2 ==");
        System.out.print("Masukkan Nilai n = ");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=n;j>=i;j--)
            {
                System.out.print("   ");
            }
            for(k=1;k<=i;k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        
        
    }
    
}
