package task1;

public class Task1 {

    public static void main(String[] args) {
        
        int nums[] = new int[6];
        
        for (int i = 0; i <= 5; i++) {
            System.out.print("enter the ");
            switch (i) {
                case 0:System.out.print("first");break;
                case 1:System.out.print("second");break;
                case 2:System.out.print("third");break;
                case 3:System.out.print("fourth");break;
                case 4:System.out.print("fifth");break;
                case 5:System.out.print("sixth");break;
            }
            System.out.print(" number:");
            java.util.Scanner t = new java.util.Scanner(System.in);
            nums[i] = t.nextInt();
        }
        
        int pos = 0;
        for (int j = 0; j <= 5; j++) {
            if (nums[j] > 0) {
                pos += 1;
            }
        }
        System.out.println(pos);

        int neg = 0;
        for (int k = 0; k <= 5; k++) {
            if (nums[k] < 0) {
                neg += 1;
            }
        }
        System.out.println(neg);

        int sum = 0, odd = 0;
        for (int z = 0; z <= 5; z++) {
            if (nums[z] % 2 == 1 || nums[z] % 2 == -1) {
                odd += 1;
                sum += nums[z];
            }
        }
        float avg = sum / odd;
        System.out.println(avg);

        int four = 0;
        for (int f = 0; f <= 5; f++) {
            if (nums[f] % 4 == 0) {
                four += 1;
            }
        }
        System.out.println(four);

    }

}