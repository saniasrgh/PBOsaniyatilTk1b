/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pratikum180325;

/**
 *
 * @author FA506NF
 */
public class TestPersegiPanjang {
    public static void main(String[] args) {
       System.out.println("Banyak objek awal = "+PersegiPanjang.getjumObjek());
       //yg dipanggil class nya (method static)
    
    //membuat objek 1
        PersegiPanjang PP1 = new PersegiPanjang();
        PP1.panjang = 5;
        PP1.lebar = 3;
        System.out.println("Banyak objek setelah PP1 = "+PersegiPanjang.getjumObjek());
        System.out.println("Luas = "+PP1.panjang+" * "+PP1.lebar+" = "+PP1.getLuas());
        
     //membuat objek 2
        PersegiPanjang PP2 = new PersegiPanjang(15,4);
        System.out.println("Banyak objek setelah PP2 = "+PersegiPanjang.getjumObjek());
        System.out.println("Keliling = 2*("+PP2.panjang+" + "+PP2.lebar+") = "+PP2.getKeliling());
    }
    
}
