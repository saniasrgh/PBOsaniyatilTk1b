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
public class mainMusik
{
     public static void main(String[] args)
     {
         Gitar gitar = new Gitar("Gitar Klasik", "petik", 6);
         Keyboard keyboard = new Keyboard("Yamaha PSR", "Elektronik", true);
         
         System.out.println(" - - INFO GITAR - -");
         gitar.info();
         gitar.mainkan();
         gitar.stem();
         
         System.out.println();
         System.out.println(" - - INFO KEYBOARD - - ");
         keyboard.info();
         keyboard.mainkan();
         keyboard.stem();
     }
}
