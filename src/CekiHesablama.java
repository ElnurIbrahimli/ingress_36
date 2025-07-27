import java.util.Scanner;

public class CekiHesablama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double boy, kilo;
        System.out.println("Boyunuzu yazin : ");
        boy = scan.nextDouble();
        System.out.println("Kilonuzu yazin : ");
        kilo = scan.nextDouble();

        double VucutIndex =  kilo / (boy * boy);

        if (18.5 >VucutIndex){
            System.out.println("Ariq : "+ VucutIndex);
        }
        else if (24.9> VucutIndex) {
            System.out.println("İdeal : "+ VucutIndex);
        }
        else if (29.9 > VucutIndex) {
            System.out.println("Orta çəkili : "+ VucutIndex);
        }
        else if (34.9>VucutIndex) {
            System.out.println("Artıq çəkili : "+ VucutIndex);
        }
        else if (VucutIndex>35) {
            System.out.println("Çox artıq çəkili : "+ VucutIndex);
        }




    }
}
