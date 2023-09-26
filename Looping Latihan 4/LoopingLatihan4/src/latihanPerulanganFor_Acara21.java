import java.util.Scanner;

public class latihanPerulanganFor_Acara21 {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingin Mencetak berapa kali? ");
        var value = input.nextInt();

        for(int i = 1; i<=value; i++){
            System.out.println("Hello JTI Ke - " + i);
        }
    }
}
