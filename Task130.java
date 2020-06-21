package task13;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        System.out.print("how many number will you enter?");
        Scanner t = new Scanner(System.in);
        int num = t.nextInt();
        int nums[] = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("enter the ");
            switch (i) {
                case 0:System.out.print("first");break;
                case 1:System.out.print("second");break;
                default:System.out.print((i + 1) + "th");
            }
            System.out.print(" number:");
            nums[i] = t.nextInt();
        }

        int max = 0, m = 0, sum = 0;
        for (int j = 0; j < num; j++) {
            if (nums[j] > max) {
                max = nums[j];
                sum = sum + nums[j];
            }
        }
        System.out.println("the maximum number is: " + max);
        double avg = sum / num;
        System.out.println("the average is: " + avg);
    }
}