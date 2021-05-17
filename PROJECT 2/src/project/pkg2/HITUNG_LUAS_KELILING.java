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
public class HITUNG_LUAS_KELILING {
    public static void main(String[] arg){
    
    double pi=3.14;
    double k,l,b;
    System.out.println("PROGRAM PENGHITUNG LUAS DAN KELILING LINGKARAN");
    System.out.println("MASUKKAN RADIUS");
    Scanner rad = new Scanner(System.in);
    b = rad.nextDouble();
    
    l = pi*b*b;
    System.out.println("Luas Lingkaran tersebut adalah "+l);
    k = pi*b*2;
    System.out.println("Keliling Lingkaran tersebut adalah "+k);
    
}
}
