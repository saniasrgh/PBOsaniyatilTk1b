/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum180325;

/**
 *
 * @author FA506NF
 */
public class PersegiPanjang {
    public int panjang;
    public int lebar;
    public static int jumObjek = 0;
    
    public PersegiPanjang(){
        jumObjek++; //bertambah satu setiap objek baru dbuat
    }
    public PersegiPanjang(int pjbaru, int lbrbaru){
        panjang = pjbaru;
        lebar = lbrbaru;
        jumObjek++;
    }
    public static int getjumObjek(){
        return jumObjek;
    }
    public int getLuas(){
        return panjang*lebar;
    }
    public int getKeliling(){
        return 2*(panjang+lebar);
    }
    
}
