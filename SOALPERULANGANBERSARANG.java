/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal.perulangan.bersarang;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class SOALPERULANGANBERSARANG {

     /**
      * @param args the command line arguments
      */
     public static void main(String[] args) {
          Scanner s = new Scanner (System.in);
          System.out.println("Program Segitiga");
          System.out.println("Masukan N = ");
          int N = s.nextInt();
          for (int a = 1; a <= N; a++) {
               for (int b = 1; b <= a; b++) {
                    System.out.print(b+" ");
               }
               System.out.println("");
          }
     }
}
