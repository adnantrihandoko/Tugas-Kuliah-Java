public class praktikum_2 {
    public static void main(String[] args) {
        int [][] nilai = new int [2][3];
        nilai[0][0] = 12;
        nilai[0][1] = 13;
        nilai[0][2] = 14;

        nilai[1][0] = 15;
        nilai[1][1] = 16;
        nilai[1][2] = 17;

        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print(nilai[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
