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
public class Percabangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai Anda: ");
        int nilai = input.nextInt();
        if(nilai >= 100){
            nilai += 10;
        }else{
            nilai -= 10;
        }
        System.out.println("Total nilai akhir Anda: " + nilai);
    }
    
}
