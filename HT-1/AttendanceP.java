import java.util.Scanner;

class AttendanceP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int present = 1,absent = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] == 1) {
                present++;
            }
            else{
                absent++;
            }
        double percentage = (present * 100.0) / n;
        int attendance = (int)Math.ceil(percentage);

        System.out.println("Present: " + present +
                           ", Absent: " + absent +
                           ", Att: " + attendance + "%");
        sc.close();
    }
}
}