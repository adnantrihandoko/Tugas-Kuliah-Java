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
public class WorkshopTif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan;
        System.out.print("Masukkan bilangan Anda: ");
        bilangan = input.nextInt();
        
        if(bilangan % 2 == 0){
        System.out.println("Bilangan anda Genap");
        }else{
        System.out.println("Bilangan anda Ganjil");
        }
    }
    
}
