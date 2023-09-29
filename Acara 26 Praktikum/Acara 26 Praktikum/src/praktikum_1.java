public class praktikum_1 {
    public static void main(String[] args) throws Exception {
        int [][] angka = {{5,4,2,1,5}, {9,6,5,7,8}, {5,2,1,5,10}};
        for (int baris = 0; baris < angka.length; baris++) {
            for (int kolom = 0; kolom < angka[baris].length; kolom++) {
                System.out.print(angka[baris][kolom] + " ");
            }
            System.out.println("");
        }
    }
}
