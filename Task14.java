package task14;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {
        System.out.print("how many digit you want the number to be? ");
        Scanner s= new Scanner(System.in);
        int dig= s.nextInt();
        
        System.out.print("please enter the number: ");
        Scanner t= new Scanner(System.in);
        int num= t.nextInt();
        int min = 9;
        float sum=0;
        while (num != 0){
            int r = num%10;
            min = Math.min(r, min);
            num /=10;
            sum+= r;
        }
        System.out.println("the minimum digit is: " + min);
        System.out.println("the avarge of the digits is: " + sum/dig);
        
    }
    
}
