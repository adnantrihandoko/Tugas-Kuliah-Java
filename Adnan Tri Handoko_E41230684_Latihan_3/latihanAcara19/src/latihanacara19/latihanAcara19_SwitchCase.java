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
public class latihanAcara19_SwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int angka;
        System.out.println("Masukkan kode kelas Anda: ");
        angka = input.nextInt();
        
        switch(angka){
            case 1: System.out.println("Anda Golongan A");
            break;
            case 2: System.out.println("Anda Golongan B");
            break;
            case 3: System.out.println("Anda Golongan C");
            break;
            case 4: System.out.println("Anda Golongan D");
            break;
            default: System.out.println("Kode yang anda masukkan salah");
        }
    }
    
}
