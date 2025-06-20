/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts2401083012;

/**
 *
 * @author FA506NF
 */
public class sepeda extends kendaraan{
   protected String jmlSadel;
   protected int jmlGir;
    
   public sepeda(){
       
   }
   public sepeda(String jmlSadel, int jmlGir){
       this.jmlSadel = jmlSadel;
       this.jmlGir = jmlGir;
   }
   
   public String getJmlSadel(){
       return this.jmlSadel;
   }
   public int getJmlGir(){
       return this.jmlGir;
   }
   public void setJmlSadel(String jmlSadel){
       this.jmlSadel = jmlSadel;
   }
   public void setJmlGir(int jmlGir){
       this.jmlGir = jmlGir;
   }
   @Override
   public void Display(){
        System.out.println("Kendaraan Sepeda");
        System.out.println("Warna : "+this.warna);
        System.out.println("Jumlah Roda : "+this.jmlRoda);       
        System.out.println("Jumlah Sadel : "+this.jmlSadel);
        System.out.println("Jumlah Gir : "+this.jmlGir);
    }
    
}
