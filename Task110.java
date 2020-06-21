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
        
        int four = 0, pos = 0, neg = 0, odd = 0;
        float sum=0;
        for (int j = 0; j <= 5; j++) {
            if (nums[j] > 0)
                pos += 1;
            
            if (nums[j] < 0)
                neg += 1;
            
            if (nums[j] % 2 == 1 || nums[j] % 2 == -1) {
                odd += 1;
                sum += nums[j];
            }    
        
            if (nums[j] % 4 == 0) 
                four += 1;
        }
        System.out.println(pos);
        System.out.println(neg);
        float avg = sum / odd;
        System.out.println(avg);
        System.out.println(four);

    }

}