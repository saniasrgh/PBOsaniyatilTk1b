/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts2401083012;

/**
 *
 * @author FA506NF
 */
public class mobil extends kendaraan{
   protected String bahanBakar;
   protected int kapasitasMesin;
    
   public mobil(){
       
   }
   public mobil(String bahanBakar, int kapasitasMesin){
       this.bahanBakar = bahanBakar;
       this.kapasitasMesin = kapasitasMesin;
   }
   
   public String getbahanBakar(){
       return this.bahanBakar;
   }
   public int getkapasitasMesin(){
       return this.kapasitasMesin;
   }
   public void setbahanBakar(String bahanBakar){
       this.bahanBakar = bahanBakar;
   }
   public void setkapasitasMesin(int kapasitasMesin){
       this.kapasitasMesin = kapasitasMesin;
   }
   @Override
   public void Display(){
        System.out.println("Kendaraan Mobil");
        System.out.println("Jumlah Roda : "+this.jmlRoda);
        System.out.println("Warna : "+this.warna);
        System.out.println("Bahan Bakar : "+this.bahanBakar);
        System.out.println("Kapasitas Mesin : "+this.kapasitasMesin+" cc");
    }
}
