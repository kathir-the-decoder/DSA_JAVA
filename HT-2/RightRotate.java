import java.util.Arrays;

public class RightRotate {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 3;
        int n = arr.length;
        if (n == 0) return;

        d = d % n; 
        if (d == 0) {
            return;
        }
        int[] temp_arr = new int[d];
        for (int i = 0; i < d; i++) {
            temp_arr[i] = arr[n - d + i];
        }
        for (int i = n - 1; i >= d; i--) {
            arr[i] = arr[i - d];
        }
        for (int i = 0; i < d; i++) {
            arr[i] = temp_arr[i];
        }
        System.out.println("Array after right rotation: " + Arrays.toString(arr));  
    }
}