package HomeWorks;
import java.util.*;
class TwoSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter the target: ");
        int target = scanner.nextInt();

        HashMap<Integer, Integer> res = new HashMap<>();
        for (int i = 0;i<nums.length; ++i) {
            int x = nums[i];
            int y = target - x;
            if (res.containsKey(y)) {
                System.out.println( res.get(y) + ", " + i);
                return;
            }
            res.put(x, i);
        }
        System.out.println("No numbers are there to get the target sum");
    
    }


    }

