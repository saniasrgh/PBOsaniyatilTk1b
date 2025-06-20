/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts2401083012;

/**
 *
 * @author FA506NF
 */

import java.util.Scanner;
public class jalan {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih,pilmobil,pilsepeda, jmlRoda, jmlGir, kecepatanMaks, jarakTempuh, kapasitasMesin, muatanMaks, tarifAwal, tarifPerKm;
        String warna, jmlSadel, bahanBakar;
        char ulang;
        
        do{
        
        System.out.println("UTS SANIYATIL WADA'I SARAGIH");
        System.out.println("NIM 2401083012");
        System.out.println("1B TEKNIK KOMPUTER");
        System.out.println("Soal Group A");
        System.out.println("--------------------------------");
        System.out.println();
        
        System.out.println("- - Menu Kendaraan - - ");
            System.out.print("Masukkan jumlah roda kendaraan : ");
            jmlRoda=input.nextInt();
            input.nextLine();
            System.out.print("Masukkan warna kendaraan : ");
            warna=input.nextLine();
            kendaraan k1 = new kendaraan(jmlRoda, warna);

            System.out.println("---Jenis kendaraan---");
            System.out.println("1. Mobil");
            System.out.println("2. Sepeda");

            System.out.print("Masukkan jenis kendaraan anda : ");
            pilih=input.nextInt();
            input.nextLine();
            
            switch(pilih){
                case 1:{
                    System.out.println("Kendaraan mobil");
                    System.out.print("Masukkan bahan bakar : ");
                    bahanBakar=input.nextLine();
                    System.out.print("Masukkan kapasitas mesin : ");
                    kapasitasMesin=input.nextInt();
                    mobil m1 = new mobil();
                    m1.setbahanBakar(bahanBakar);
                    m1.setkapasitasMesin(kapasitasMesin);

                    System.out.println("---Jenis Mobil---");
                    System.out.println("1. Truk");
                    System.out.println("2. Taksi");
                    System.out.print("Masukkan jenis mobil anda : ");
                    pilmobil=input.nextInt();
                    
                    switch(pilmobil){
                        case 1:{
                            System.out.println("Mobil Truk");
                            System.out.print("Masukkan muatan Maks : ");
                            muatanMaks=input.nextInt();
                            truk t1 =  new truk();
                            t1.setMuatanMaks(muatanMaks);

                            //output
                            System.out.println();
                            System.out.println(" - - Data Kendaraan - - ");
                            System.out.println("Kendaraan Mobil Truk");
                            System.out.println("Jumlah Roda kendaraan = "+k1.getjmlRoda()+" roda");
                            System.out.println("Warna Kendaraan = "+k1.getwarna());
                            System.out.println("Bahan Bakar = "+m1.getbahanBakar());
                            System.out.println("Kapasitas Mesin = "+m1.getkapasitasMesin()+(" liter"));
                            System.out.println("Muatan Maks = "+t1.getMuatanMaks()+" KG");
                            break;
                        }
                        case 2:{
                            System.out.println("Mobil Taksi");
                            System.out.print("Masukkan tarif awal : ");
                            tarifAwal=input.nextInt();
                            System.out.print("Masukkan tarik per km : ");
                            tarifPerKm=input.nextInt();
                            taksi ts1 = new taksi();
                            ts1.settarifAwal(tarifAwal);
                            ts1.settarifPerKm(tarifPerKm);

                            //output
                            System.out.println();
                            System.out.println(" - - Data Kendaraan - - ");
                            System.out.println("Kendaraan Mobil Taksi");
                            System.out.println("Jumlah Roda kendaraan = "+k1.getjmlRoda()+" roda");
                            System.out.println("Warna Kendaraan = "+k1.getwarna());
                            System.out.println("Bahan Bakar = "+m1.getbahanBakar());
                            System.out.println("Kapasitas Mesin = "+m1.getkapasitasMesin()+" liter");
                            System.out.println("Tarif Awal = "+ts1.tarifAwal+" rupiah");
                            System.out.println("Tarif Per KM = "+ts1.tarifPerKm+" rupiah");
                            break;
                        }
                    }
                    break;
                }
                case 2:{
                    System.out.println("Kendaraan Sepeda");
                    System.out.print("Masukkan jumlah Sadel: ");
                    jmlSadel=input.nextLine();
                    System.out.print("Masukkan jumlah gir: ");
                    jmlGir=input.nextInt();
                    sepeda s1 = new sepeda(jmlSadel, jmlGir);

                    System.out.println("---Menu Sepeda---");
                    System.out.println("1. Sepeda Biasa");
                    System.out.println("2. Sepeda Listrik");
                    System.out.print("Masukkan pilihan sepeda anda :");
                    pilsepeda=input.nextInt();
                    
                    if(pilsepeda==2){
                        System.out.println("Sepeda Listrik");
                        System.out.print("Masukkan kecepatan maks(km/jam): ");
                        kecepatanMaks=input.nextInt();
                        System.out.print("Masukkan jarak tempuh(km): ");
                        jarakTempuh=input.nextInt();
                        sepeda_listrik l1= new sepeda_listrik(kecepatanMaks, jarakTempuh);

                        //output
                        System.out.println();
                        System.out.println(" - - Data Kendaraan - - ");
                        System.out.println("Kendaraan Sepeda Listrik");
                        System.out.println("Jumlah Roda kendaraan = "+k1.getjmlRoda()+" roda");
                        System.out.println("Warna Kendaraan = "+k1.getwarna());
                        System.out.println("Jumlah Sadel = "+s1.getJmlSadel());
                        System.out.println("Jumlah Gir = "+s1.getJmlGir());
                        System.out.println("Kecepatan Maks = "+l1.getKecepatanMaks()+"km/jam");
                        System.out.println("Jarak Tempuh = "+l1.getJarakTempuh()+"km");
                    }
                    else{

                        System.out.println();
                        System.out.println(" - - Data Kendaraan - - ");
                        System.out.println("Kendaraan Sepeda Biasa");
                        System.out.println("Jumlah Roda kendaraan = "+k1.getjmlRoda()+" roda");
                        System.out.println("Warna Kendaraan = "+k1.getwarna());
                        System.out.println("Jumlah Sadel = "+s1.getJmlSadel());
                        System.out.println("Jumlah Gir = "+s1.getJmlGir());
                    }
                    break;
                }
                 default:{
                    System.out.println("Pilihan anda salah!");
                    break;
                }
            }
        input.nextLine();
        System.out.println("Apakah Anda ingin mengulang? (y/n)");
        ulang = input.nextLine().charAt(0);
        }while(ulang=='y'||ulang=='Y');
            
    }
}
