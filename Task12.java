package task12;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
        System.out.println("please enter a number to check if prime or not");
        Scanner t= new Scanner(System.in);
        int num = t.nextInt();
        if (num%2==0 || num%3==0 || num%5==0 || num%7==0 || num%11==0)
            System.out.println("the number is not prime");
        else 
            System.out.println("the number is prime");
    }
    
}
