// Problem: Placement Cutoff Count
// A placement test is conducted for N candidates. Each candidate receives a score. A company has set a minimum cutoff score of C.
// Your task is to count how many candidates scored at least C.
// Note: A score exactly equal to C is also considered qualified.
// Input Format
// •	The first line contains two integers N and C. 
// •	The second line contains N integers representing the candidates' scores. 
// Output Format
// Print a single integer representing the number of candidates who scored at least C.
// Constraints
// •	1 ≤ N ≤ 10^5 
// •	0 ≤ score, C ≤ 100 
// •	N scores will be provided. 
// Sample Test Case 1
// Input
// 6 60
// 45 72 61 58 90 60
// Output
// 4
// Explanation: Scores 72, 61, 90, 60 are at least 60.

import java.util.*;

public class PlacementCutoff {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();//no of candidates
        int C = sc.nextInt();//cutoff

        int count = 0;

        for (int i = 0; i < N; i++) {

            int score = sc.nextInt();

            if (score >= C) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}
        
        
