import java.util.*;

class Cumulative_Sales {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] sales = new int[n];

        for(int i = 0; i < n; i++) {
            sales[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {

            int sum = 0;

            for(int j = 0; j <= i; j++) {
                sum = sum + sales[j];
            }

            System.out.print(sum + " ");
        }
    }
    
}