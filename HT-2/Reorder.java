import java.util.Arrays;

public class Reorder{

    public static void main(String[] args) {
        int[] arr = {50, 40, 70, 60, 90};
        int[] index = {3,  0,  4,  1,  2};
        int n = arr.length;
        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            int targetIndex = index[i];
            temp[targetIndex] = arr[i];
        }
        System.out.println(Arrays.toString(temp));
    }
}