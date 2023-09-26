import java.util.Scanner;

public class latihanPerulanganDoWhile_Acara21 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int angka, b;
        System.out.println("=====PROGRAM LOOP DENGAN BREAK=====");
        b = 0;
        do {
            System.out.println("Masukkan bilangan: ");
            angka = input.nextInt();
            b += angka;
            if(b>50) break;
        } while (true);

        // Scanner input = new Scanner(System.in);
        // int angka, b;
        // System.out.println("=====PROGRAM LOOP DENGAN BREAK=====");
        // System.out.println("Masukkan bilangan: ");
        // angka = input.nextInt();
        // b = 0;
        // do {
        //     b += angka;
        //     System.out.printf("Angka berhenti pada angka ke " + b);
        //     if(b>50) break;
        // } while (true);
            
            
        // System.out.print("Masukkan Bilangan: ");
        // var value = input.nextInt();
        // int i = 1;
        // do {
            
        //     System.out.println("Anda mencetak sejumlah " + i + " Kali");
        //     i++;
        // } while (i<=value);

    }
}
