class LeftRotate {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int d = 2;
        int n = arr.length;

        d = d % n; 
        if (d == 0) {
            return;
        }

        int[] temp_arr = new int[d];
        for (int i = 0; i < d; i++) {
            temp_arr[i] = arr[i];
        }
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp_arr[i];
        }
        System.out.println("Array after left rotation: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}