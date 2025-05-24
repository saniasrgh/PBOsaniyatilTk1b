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
    private String bahanBakar;
    private int kapasitasMesin;
    
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
}
