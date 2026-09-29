import java.util.*;

class Adding_integer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter expression: ");
        String str = sc.nextLine();

        String[] parts = str.trim().split("\\s+");

        int a = Integer.parseInt(parts[0]);
        String op = parts[1];
        int b = Integer.parseInt(parts[2]);

        int ans = 0;

        switch(op) {
            case "+":
                ans = a + b;
                break;
            case "-":
                ans = a - b;
                break;
            case "*":
                ans = a * b;
                break;
            case "/":
                ans = a / b;
                break;
        }

        System.out.println(ans);
    }
}