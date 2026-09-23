import java.util.Arrays;

public class DelFirstAcc {
    public static void main(String[] args) {
        int[] arr = {10, 20, 40, 20, 20, 30};
        int ele = 20;
        int n = arr.length;
        int targetIndex = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == ele) {
                targetIndex = i;
                break; 
            }
        }


        if (targetIndex == -1) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        int[] result = new int[n - 1];
        int idx = 0;

        for (int i = 0; i < n; i++) {
            if (i != targetIndex) { 
                result[idx] = arr[i];
                idx++;
            }
        }

        System.out.println(Arrays.toString(result));
    }
}