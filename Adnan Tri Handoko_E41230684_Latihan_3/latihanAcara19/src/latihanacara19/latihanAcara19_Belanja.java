/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanacara19;
import java.util.Scanner;
/**
 *
 * @author LAB KSI
 */
public class latihanAcara19_Belanja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int bayar;
       
       System.out.print("Masukkan total belanja Anda: ");
       bayar = input.nextInt();
       
       if(bayar>=2000000){
           System.out.println("Selamat Anda mendapatkan hadiah kompor gas");
       }else if(bayar>=1000000){
       System.out.println("Selamat Anda mendapatkan hadiah teflon");
       }else if(bayar>=500000){
       System.out.println("Selamat Anda mendapatkan hadiah piring");
       }else{
       System.out.println("Maaf anda belum beruntung, tingkatkan belanja anda!");
       }
       
    }
    
}
