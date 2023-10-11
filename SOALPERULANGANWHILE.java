/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal.perulangan.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class SOALPERULANGANWHILE {

     /**
      * @param args the command line arguments
      */
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          System.out.println("Masukan Bilangan");
          int a = s.nextInt();
          int b = 1;
          while (b<=a){
               System.out.println(""+b);
               b +=2;
          }
     }
}