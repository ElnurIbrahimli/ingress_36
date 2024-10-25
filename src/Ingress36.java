import java.util.Scanner;

class Ingress36 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int reqem1, reqem2, secim;
        System.out.println("Ilk ededi daxil edin: ");
        reqem1 = scan.nextInt();
        System.out.println("2 ci ededi daxil edin: ");
        reqem2 = scan.nextInt();
        System.out.println("Asagidakilarden birini secin");
        System.out.println("1 ci Toplama");
        System.out.println("2 ci cixma");
        System.out.println("3 ci vurma");
        System.out.println("4 ci bolme");
        System.out.println("seciminiz =");
        secim = scan.nextInt();

        if(secim==1){
            System.out.println(reqem1 + reqem2);
        }
        else if (secim==2) {
            System.out.println(reqem1 - reqem2);
        }
        else if (secim==3) {
            System.out.println(reqem1 * reqem2);

        } else if (secim==4) {
            if (reqem2==0){
                System.out.println("ededi 0 boldukda hemin ededin ozu alinir");
            }else
              System.out.println(reqem1/reqem2);

        }else{
            System.out.println("yuxaridakilardan birini secin");

        }


    }
  }







