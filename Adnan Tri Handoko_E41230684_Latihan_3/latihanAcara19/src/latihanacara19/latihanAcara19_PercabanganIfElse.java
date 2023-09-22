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
public class latihanAcara19_PercabanganIfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;
        System.out.println("Masukkan Angka: ");
        angka = input.nextInt();
        if (angka > 70) {
            System.out.println("Selamat anda dinyatakan diterima");
        }else{
                System.out.println("Silahkan coba tes lagi tahun depan");
                }
    }

}
