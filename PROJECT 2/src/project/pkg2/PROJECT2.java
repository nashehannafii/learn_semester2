/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg2;

/**
 *
 * @author nashe
 */
import java.util.Scanner;
public class PROJECT2  { //PROJECT GANJIL GENAP

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int bil,hasil;
    
    System.out.println("-------------------");
    System.out.println("MASUKKAN BILANGAN :");
    Scanner angka = new Scanner (System.in);
    bil=angka.nextInt();
    
    hasil = bil%2;
    if (hasil==1)
        System.out.println( "adalah bilangan GANJIL");
    
    else if (hasil==0)
        System.out.println( "adalah bilangan GENAP");
    }
    
}
