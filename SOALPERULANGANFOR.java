/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal.perulangan.pkgfor;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class SOALPERULANGANFOR {

     /**
      * @param args the command line arguments
      */
     public static void main(String[] args) {
          Scanner s = new Scanner (System.in);
          System.out.println("Masukan Bilangan");
          int a = s.nextInt();
          for (int e = 1; e <= a; e+=2) {
               System.out.println(""+e);
          }
     }
}