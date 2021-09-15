package Assignment1;

import java.util.Scanner;

public class ResultDeclaration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        checkResult(sc.nextInt(), sc.nextInt(), sc.nextInt());
    }
    public static void checkResult(int marks1, int marks2, int marks3){
        if(marks1 > 60 && marks2 > 60 && marks3 > 60)
            System.out.println("Passed");
        else if(((marks1 + marks2)>120) || ((marks2 + marks3) > 120)||((marks1 + marks3)>120))
            System.out.println("Promoted");
        else
            System.out.println("Failed");
    }
}
