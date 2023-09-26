import java.util.Scanner; //mengimport class Scanner yang berada pada package java.util, yang berfungsi untuk membaca input dari user

public class latihanPerulanganFor_Acara21 {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);//mendefinisikan objek scanner dengan nama objek input yang menerima parameter berupa system.in
        System.out.print("Ingin Mencetak berapa kali? ");//menampilkan pesan ke terminal
        var value = input.nextInt();//menampung nilai dari inputan user yang diterima oleh scanner
        for(int i = 1; i<=value; i++){
            System.out.println("Hello JTI Ke - " + i);
        }//mendefinisikan variabel i adalah 1, memasukkan kondisi dimana looping akan dieksekusi, setelah blok kode di eksekusi variabel i ditambah 1
    }
}
