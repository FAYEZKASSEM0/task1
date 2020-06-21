package task15;

import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {
        System.out.print("enter a year to start from: ");
        Scanner b = new Scanner(System.in);
        short start = b.nextShort();
        
        System.out.print("till? ");
        Scanner e = new Scanner(System.in);
        short end = e.nextShort();
        
        for (int i =start; i<=end; i++){
            if (i%4 == 0)
                System.out.println(i);
        }

    }
    
}
