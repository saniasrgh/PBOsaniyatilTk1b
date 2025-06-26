/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PratikumOnline250325;

/**
 *
 * @author FA506NF
 */
/** NAMA : SANIYATIL WADA'I BR SARAGIH
    NIM  : 2401083012
    KELAS : 1B TEKNIK KOMPUTER
*/
class Nasabah {
    private String namaAwal;
    private String namaAkhir;
    private Tabungan tabungan;
        
    //Konstruktor dengan parameter
    public Nasabah(String namaAwal, String namaAkhir) {
        this.namaAwal = namaAwal;
        this.namaAkhir = namaAkhir;
    }
    public void settabungan(Tabungan tabungan){
        this.tabungan = tabungan;
    }
    public Tabungan getTabungan(){
        return tabungan;
    }
    
    //getter untuk nama awal
    public String getnamaAwal(){
        return namaAwal;
    }
    @Override
    public String toString(){
        //return namaAwal + " " + namaAkhir + " - " + (tabungan!= null? tabungan.toString():"Tidak ada tabungan");
        if (tabungan !=null){
            return namaAwal+ " " +  namaAkhir+ " - Saldo : " + tabungan.toString();
        }else {
            return namaAwal+ " " + namaAkhir + " - Tidak ada tabungan";
        }
    }
    
}
