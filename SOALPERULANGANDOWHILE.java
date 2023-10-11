/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal.perulangan.pkgdo.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class SOALPERULANGANDOWHILE {

     /**
      * @param args the command line arguments
      */
     public static void main(String[] args) {
          Scanner s = new Scanner (System.in);
          System.out.println("Masukan Bilangan");
          int a = s.nextInt();
          int plus = 1;
          do {
               System.out.println(plus +" ");
               plus += 2;
          } while (a >= plus);
     }
}
