import java.util.Scanner;

public class Scores {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] scores = new double[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextDouble();
        }
        System.out.println("Scores:");

        for (int i = 0; i < n; i++) {
            System.out.print((int)scores[i] + " ");

            if ((i + 1) % 4 == 0) {
                System.out.println();
            }
        }
        if (n % 4 != 0) {
            System.out.println();
        }

        double sum = 0;

        for (int i = 0; i < n; i++) {
            sum += scores[i];
        }

        double average = sum / n;

        System.out.printf("Average: %.2f%n", average);
        double lowest = scores[0];

        for (int i = 1; i < n; i++) {
            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }

        System.out.println("Lowest Score:"+ (int)lowest);
        double highest = scores[0];

        for (int i = 1; i < n; i++) {
            if (scores[i] > highest) {
                highest = scores[i];
            }
        }

        System.out.println("Highest Score:"+ (int)highest);

        System.out.println("Score  Deviation");

        double squaredSum = 0;

        for (int i = 0; i < n; i++) {

            double deviation = scores[i] - average;

            System.out.printf("%.0f     %.2f%n",
                    scores[i], deviation);

            squaredSum += deviation * deviation;
        }
        double standardDeviation =
                Math.sqrt(squaredSum / n);

        System.out.printf("Standard Deviation: %.2f%n",
                standardDeviation);
        double lower = average - standardDeviation;
        double upper = average + standardDeviation;

        int count = 0;

        for (int i = 0; i < n; i++) {

            if (scores[i] >= lower &&
                scores[i] <= upper) {

                count++;
            }
        }

        System.out.println(
                "Scores within one standard deviation: "
                + count);

        sc.close();
    }
}