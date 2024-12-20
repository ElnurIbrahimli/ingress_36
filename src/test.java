public class test {
    public static void main(String[] args) {
        int a = 1267859;
        int s = 0;

        while (a > 0) {
            s = a%10;

            if(s == 8){
                System.out.println("Yes");
                break;
            }else
                System.out.println("yoxdur");
            a = a/10;

        }



    }
}
