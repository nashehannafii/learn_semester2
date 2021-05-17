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
public class PERBANDINGAN_SUHU {
    public static void main(String[]arg){
        double R,C,F;
        System.out.println("PROGRAM PERBANDINGAN SUHU");
        System.out.println("MASUKKAN SUHU AWAL(CELCIUS)");
        Scanner suhuc = new Scanner(System.in);
        C = suhuc.nextDouble();
        //PROCESS
        R = (4*C)/5;
        F = (9*C+32)/5;
        System.out.println(R+" UNTUK REAMUR");
        System.out.println(F+" UNTUK FARENHEIT");
    }  
}
