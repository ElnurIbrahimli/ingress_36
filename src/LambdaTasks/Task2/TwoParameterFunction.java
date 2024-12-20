package LambdaTasks.Task2;

import LambdaTasks.Task1.SingleParameterFunction;

public interface TwoParameterFunction {

    int add(int x, int y);
}

class Main {
    public static void main(String[] args) {

        TwoParameterFunction addition = (x, y) -> x + y;

        int num1 = 8;
        int num2 = 14;
        int result = addition.add(num1,num2);


        System.out.println("1 answer " + num1);
        System.out.println("2 answer " + num2);
        System.out.println("sum " + result);
    }
}