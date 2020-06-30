import java.io.*;
import java.util.Scanner;

class Colors {

    static void sortColors(int[] arr, int size) {
        int low = 0;
        int high = size - 1;
        int mid = 0;
        int temp = 0;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0: {
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2: {
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int size = arr.length;

        sortColors(arr, size);

        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
