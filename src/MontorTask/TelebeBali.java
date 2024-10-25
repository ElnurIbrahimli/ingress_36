package MontorTask;

public class TelebeBali {
    public static void main(String[] args) {
        int[] Telebeler = {25, 67, 78, 90, 96, 89, 74, 64,};

        for (int i = 0; i < Telebeler.length; i++) {
            if (Telebeler[i] > 70) {
                telebebali(Telebeler[i]);
            }


        }

    }

    private static void telebebali(int telebeler) {
        System.out.println("bali 70 den yuxari olan telebeler: " + telebeler);

    }

}
