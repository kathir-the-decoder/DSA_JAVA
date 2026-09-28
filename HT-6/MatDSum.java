class MatDSum {
    public int MatDSum(int[][] mat) {
        int ans = 0;
        int n = mat.length;

        for (int i = 0; i < n; i++) {
            int j = n - i - 1;
           
            ans += mat[i][i] + (i == j ? 0 : mat[i][j]);
        }

        return ans;
    }

    public static void main(String[] args) {
        MatDSum solution = new MatDSum();

        int[][] mat1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Result : " + solution.MatDSum(mat1)); 
    }
}