import java.util.Scanner;

public class latihanPerulanganWhile_Acara21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingin mencetak berapa kali? ");
        var value = input.nextInt();

        int count = 1; 
        while(count<=value){
            System.out.println("Hallo Program Java ke -" + count);
            count++;
        }
    }
}
