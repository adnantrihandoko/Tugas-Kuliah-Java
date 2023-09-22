/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logikadanalgoritma;
import java.util.Scanner;

/**
 *
 * @author LAB KSI
 */
public class LogikaDanAlgoritma_Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String warna;
        System.out.print("Masukkan warna lampu lalu lintas: ");
        warna = input.nextLine();
        
        switch(warna){
            case "merah", "Merah", "MERAH" -> System.out.println("Anda harus berhenti!");
            case "Kuning", "kuning", "KUNING" -> System.out.println("Persiapan Berhenti!");
            case "hijau", "HIJAU", "Hijau" -> System.out.println("Silahkan Jalan!");
            default -> System.out.println("Warna yang anda masukkan salah");
        }
    }
    
}
