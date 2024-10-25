import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String mail, parol;
        System.out.println("g-mailinizi girin: ");
        mail = scn.nextLine();
        System.out.println("parolanizi girin: ");
        parol = scn.nextLine();
        if (mail.equals("elnuribrahimli") && parol.equals("204985")) {

            System.out.println("Duzgun bir sekilde daxil oldunuz");
        }

            else{
                 System.out.println("Giris duzgun deyil");
            }

    }
}