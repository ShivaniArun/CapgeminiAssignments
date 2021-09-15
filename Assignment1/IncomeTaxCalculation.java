package Assignment1;

import java.util.Scanner;

public class IncomeTaxCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        if(income < 180000)
            System.out.println("No Tax to be paid");
        else if(income > 180000 && income < 300000)
            calcTaxAmount(income, 10);
        else if(income > 300000 && income < 500000)
            calcTaxAmount(income,20);
        else
            calcTaxAmount(income,30);

    }
    public static void calcTaxAmount(int income, double tax){
        System.out.println("Tax Deduction is " + (0.01 * tax * income ));
    }
}
