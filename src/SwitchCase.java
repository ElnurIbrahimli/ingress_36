import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Eded daxil edin: ");
        int sayi = scan.nextInt();
        switch (sayi) {
            case 1:
                System.out.println("verdiyiniz reqem 1 e beraberdir");
                break;
            case 2:
                System.out.println("verdiyiniz reqem 2 e beraberdir");
                break;
            case 3:
                System.out.println("verdiyiniz reqem 3 e beraberdir");
                break;
            case 4:
                System.out.println("verdiyiniz reqem 4 e beraberdir");
                break;
            default:
                System.out.println("sadece 4 reqem sece bilersiniz");
                // Salam Elesger

        }


    }

}
