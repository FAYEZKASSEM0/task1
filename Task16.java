package task16;

import java.util.Scanner;

public class Task16 {

    public static void main(String[] args) {
        System.out.print("please enter the first number: ");
        Scanner f = new Scanner(System.in);
        short first = f.nextShort();
        
        System.out.print("please enter the second number: ");
        Scanner s = new Scanner(System.in);
        short second = s.nextShort();
        
        for (int i =first; i<=second; i++){
            if (i%2 == 0){
                if (i%7 ==0)
                    System.out.println(i);
            }
        }
        
    }
    
}
