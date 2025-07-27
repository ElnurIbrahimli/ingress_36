import java.util.Scanner;

public class İlHesablama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ilinizi girin : ");
        int il = input.nextInt();

        if (il%12==0){
            System.out.println("Maymun");
        } else if (il%12==1) {
            System.out.println("Horoz");
        } else if (il%12==2) {
            System.out.println("Köpek");
        }else if (il%12==3) {
            System.out.println("Domuz");
        }else if (il%12==4) {
            System.out.println("Fare");
        }else if (il%12==5) {
            System.out.println("Öküz");
        }else if (il%12==6) {
            System.out.println("Kaplan");
        }else if (il%12==7) {
            System.out.println("Tavşan");
        }else if (il%12==8) {
            System.out.println("Ejderha");
        }else if (il%12==9) {
            System.out.println("Yılan");
        }else if (il%12==10) {
            System.out.println("At");
        }else if (il%12==11) {
            System.out.println("Koyun");
        }
    }
}
