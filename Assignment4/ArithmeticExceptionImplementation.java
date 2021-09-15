package Assignment4;

import java.util.Scanner;

public class ArithmeticExceptionImplementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        division(sc.nextInt(),sc.nextInt());
        } catch(ArithmeticException e){
            throw new UnsupportedOperationException("This is unsupported operation Exception");
        }
    }
    public static void division(int num1, int num2) throws ArithmeticException {
        int div = num1/num2;
        System.out.println(div);
    }

}
