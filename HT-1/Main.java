import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        int present = 0,absent = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] == 1) {
                present++;
            }
            else{
                absent++;
            }
        }

        

        double percentage = (present * 100.0) / n;
        int attendance = (int)(percentage);

        System.out.println("Present: " + present);
        System.out.println("Absent: " + absent);                   
        System.out.println("Attendance(%): " + attendance );
        sc.close();
    }
}