package task.pkg17;

import java.util.Scanner;

public class Task17 {

    public static void main(String[] args) {
        System.out.print("please enter a number: ");
        Scanner n= new Scanner(System.in);
        int num = n.nextInt();
        int factorial = 1;
        for (int i=0; i<=num ; i++){
            if (i%2 != 0)
                factorial *= i;
        }
        System.out.print("the odd factorial = " + factorial);

    }
    
}
