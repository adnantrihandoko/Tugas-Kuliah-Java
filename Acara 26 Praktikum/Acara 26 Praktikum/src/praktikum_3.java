import java.util.Scanner;

public class praktikum_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah Mahasiswa: ");
        int jumlahMahasiswa = Integer.parseInt(input.nextLine()); 
        String mahasiswa[][] = new String[jumlahMahasiswa][3];
        
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan Data Mahasiswa ke " + (i+1) + "\n");
            for (int j = 0; j < 3; j++) {
                if(j == 0){
                    System.out.print("Masukkan NIM: ");
                    mahasiswa[i][j] = input.nextLine();
                    // mahasiswa [i][j] = input.nextLine();
                }else if(j == 1){
                    System.out.print("Masukkan Nama: ");
                    mahasiswa[i][j] = input.nextLine();
                    // mahasiswa [i][j] = input.nextLine();
                }else if(j == 2){
                    System.out.print("Masukkan Jurusan: ");
                    // mahasiswa [i][j] = input.nextLine();
                    mahasiswa[i][j] = input.nextLine();
                }
            }
        }

        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("=====================");
            System.out.println("Data Mahasiswa " + (i+1));

            for (int j = 0; j < mahasiswa[i].length; j++) {
                if (j==0) {
                    String a = "NIM: ";
                    System.out.print(a + mahasiswa[i][j] + "\n");
                } else if(j == 1){
                    String b = "Nama: ";
                    System.out.print(b + mahasiswa[i][j] + "\n");
                } else if(j == 2){
                    String c = "Jurusan: ";
                    System.out.print(c+ mahasiswa[i][j] + "\n");
                }
            }
        }
    }
}

