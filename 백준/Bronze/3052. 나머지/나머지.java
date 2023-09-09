import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[42];
        for (int i = 1; i <= 10; i++) {
            int n = sc.nextInt();
            nums[n % 42]++;
        }

        int result = 0;
        for (int n : nums) {
            if (n != 0) result++;
        }

        System.out.println(result);
    }
}