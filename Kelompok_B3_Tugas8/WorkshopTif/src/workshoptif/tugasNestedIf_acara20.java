/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package workshoptif;
import java.util.Scanner;
/**
 *
 * @author LAB KSI
 */
public class tugasNestedIf_acara20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int total, diskon, bayar;
        String kartu;
        Scanner input = new Scanner(System.in);
        System.out.print("Apakah anda mempunyai kartu anggota? (y atau t)");
        kartu = input.nextLine();
        System.out.print("Berapa total harga belanjaan Anda? ");
        total = input.nextInt();
        if(kartu.equals("y") || kartu.equals("Y")){
            if(total > 500000){
            System.out.println("Selamat anda mendapatkan diskon sebesar Rp. 50.000");
            diskon = 50000;
            }else{
                System.out.println("Selamat anda mendapatkan diskon sebesar Rp. 25.000");
                diskon = 25000;}
        }else if(total > 200000){
            System.out.println("Selamat anda mendapatkan diskon sebesar Rp. 10.000");
            diskon = 10000;
        }else{
            diskon = 0;
            System.out.println("Diskon Anda = " + diskon + " Maaf Anda tidak mendapatkan Diskon. Tingkatkan barang belanjaan anda untuk mendapat diskon.");
        }
        
        bayar = total - diskon;
        System.out.println("Total yang harus Anda bayar: " + bayar);
    }
    
}
