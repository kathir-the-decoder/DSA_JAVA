class MaxSumSubarray {
    public int maxSumSubarray(int[] arr, int k) {
        int currentSum = 0;

        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }

        int maxSum = currentSum;

        for (int i = k; i < arr.length; i++) {
            currentSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
            }
    

public static void main(String[] args){
    MaxSumSubarray solution = new MaxSumSubarray();
    int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
    int k = 4;
    int result = solution.maxSumSubarray(arr, k);
    System.out.println("Result: " + result); 
}
}