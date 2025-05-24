/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pratikum250325;

/**
 *
 * @author FA506NF
 */
public class TestPersegiPanjangEnkapsulasi {
    public static void main(String[] args) {
        System.out.println("Banyak objek awal = "+PersegiPanjangEnkapsulasi.getjumObjek());
       //yg dipanggil class nya (method static)
    
    //membuat objek 1
        PersegiPanjangEnkapsulasi  PP1 = new PersegiPanjangEnkapsulasi ();
        PP1.pjg = 10;
        PP1.lbr = 5;
        System.out.println("Banyak objek setelah PP1 = "+PersegiPanjangEnkapsulasi.getjumObjek());
        System.out.println("Luas = "+PP1.pjg+" * "+PP1.lbr+" = "+PP1.getLuas());
        
     //membuat objek 2
        PersegiPanjangEnkapsulasi PP2 = new PersegiPanjangEnkapsulasi(15,4);
        System.out.println("Banyak objek setelah PP2 = "+PersegiPanjangEnkapsulasi .getjumObjek());
        System.out.println("Keliling = 2*("+PP2.pjg+" + "+PP2.lbr+") = "+PP2.getKeliling());
    }
    
}
