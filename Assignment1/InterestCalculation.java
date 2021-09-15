package Assignment1;

import java.util.Scanner;

public class InterestCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();
        System.out.println("Simple Interest is "+ calcSI(principal,rate,time));
        System.out.println("Compound Interest is "+ calcCI(principal,rate,time));
    }
    public static double calcCI(double principal, double rate, double time){
        return (principal * Math.pow((1 + rate * 0.01),time)) - principal;
    }
    public static double calcSI(double principal, double rate, double time){
        return principal * rate * time/100;
    }
}
