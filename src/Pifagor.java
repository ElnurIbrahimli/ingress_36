import java.util.Scanner;

public class Pifagor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int katet1, katet2;

        System.out.print("1 ci kateti daxil edin: ");
        katet1 = scan.nextInt();

        System.out.print("2 ci kateti daxil edin: ");
        katet2 = scan.nextInt();


        double Hipotenuz = Math.sqrt(katet1 * katet1 + katet2 * katet2);
        System.out.println("Hipetonuz: " + Hipotenuz);


    }
}
