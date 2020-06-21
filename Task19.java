package task19;

import java.util.Scanner;

public class Task19 {

    public static void main(String[] args) {
        System.out.print("please enter the first number: ");
        Scanner f= new Scanner(System.in);
        int first = f.nextInt();
        
        System.out.print("please enter the second number: ");
        Scanner s= new Scanner(System.in);
        int second = s.nextInt();
        int sum=0;
        for(int i=0; i<second; i++)
            sum +=  first;
        
        System.out.println(sum);
    }
    
}
