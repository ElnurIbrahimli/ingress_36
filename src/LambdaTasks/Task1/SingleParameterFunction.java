package LambdaTasks.Task1;

public interface SingleParameterFunction {
    int calculate(int x);
}

class Main{
    public static void main(String[] args) {
        SingleParameterFunction squareFunction = x -> x * x;

        int input =  7;
        int result = squareFunction.calculate(input);

        System.out.println("input " + input);
        System.out.println("Square " + result);

    }

}
