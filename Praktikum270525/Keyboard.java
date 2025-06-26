/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum270525;

/**
 *
 * @author USer
 */
public class Keyboard extends AlatMusik implements BisaDinyalakan
{
    private boolean dayaTersambung;
    
    public Keyboard(String nama, String jenis, boolean dayaTersambung)
    {
        super(nama, jenis);
        this.dayaTersambung = dayaTersambung;
    }
    
    @Override
    public void nyalakan()
    {
        if (cekListrik())
            
        {
            System.out.println(nama + " tidak bisa dinyalakan.");
        }
        else
        {
            System.out.println(nama + " dimatikan.");
        }
    }
    
    @Override
    public void matikan()
    {
        System.out.println(nama + " dimatikan.");
    }
    
    @Override
    public boolean cekListrik()
    {
        return dayaTersambung;
    }
    @Override
    public void stem()
    {
        System.out.println(nama + " dimainkan dengan menekan.");
    }
    @Override
    public void mainkan()
    {
        System.out.println("Keyboard " + nama + " distem digital melalui aplikasi.");
    }
}
