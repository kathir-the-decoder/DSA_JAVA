import java.util.Arrays;
public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        int s = 0, n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[s];
                nums[s++] = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
    
    