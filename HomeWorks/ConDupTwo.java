package HomeWorks;
import java.util.*;


public class ConDupTwo {

    public static boolean containsDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; ++i) {
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
                return true;
            }
            map.put(nums[i], i);
        }
        
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Input array elements
        int[] nums = new int[n];
        System.out.println("Enter " + n + " integers separated by space:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Input k
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        // Run solution and print result
        boolean result = containsDuplicate(nums, k);
        System.out.println("Result: " + result);

        scanner.close();
    }
}