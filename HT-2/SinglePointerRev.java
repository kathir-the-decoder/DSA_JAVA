import java.util.Scanner;
import java.util.Arrays;
public class SinglePointerRev{
    public static void main(String[] args) {
        try{
        Scanner sc = new Scanner(System.in);

            System.out.print("Enter array size: ");
            int n = sc.nextInt();

            int[] arr = new int[n];
            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[n - 1 - i];  
                arr[n - 1 - i] = temp;
            }

            System.out.println(Arrays.toString(arr));
            sc.close();
        } catch (Exception e) {
            System.out.println("Invalid input! Only integers are allowed.");
        } 
    }
}
