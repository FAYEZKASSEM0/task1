package task12;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
        System.out.println("please enter a number to check if prime or not: ");
        Scanner t= new Scanner(System.in);
        int num = t.nextInt();
        boolean prime ;
    
        if (num % 2 == 0 || num % 3 == 0 || num%5 == 0 || num%7 == 0) prime=false; 
        else prime=true;
        if (num <= 1) prime=false; 
        if (num <= 3&&num>1) prime=true;   
        if (prime)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    
    }
    
}
