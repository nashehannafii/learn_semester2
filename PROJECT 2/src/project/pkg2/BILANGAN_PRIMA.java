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
public class BILANGAN_PRIMA {
    public static void main(String[]arg){
        int bilprim,hasil;
        
        System.out.println("MASUKKAN BILANGAN");
        Scanner bil1 = new Scanner(System.in);
        
        bilprim = bil1.nextInt();
        
        boolean prima = true ;
        for(int ygbg = 2;ygbg<=bilprim/2;ygbg++){
            hasil = bilprim%ygbg;
            if(hasil==0){
                prima = false;
            break;
            }   
        }
        if(prima && (bilprim>0)&& (bilprim !=1))
            System.out.println(bilprim+" adalah bilangan PRIMA");
        else
            System.out.println(bilprim+" BUKAN bilangan PRIMA");
    }
}
