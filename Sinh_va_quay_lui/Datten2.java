
/*
 * 1.13
 * O(n)
 */

import java.util.Scanner;

public class Datten2 {
    static boolean isLast = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] arr = new int[k];
            for (int i = 0; i < k; i++) {
                arr[i] = i + 1;
            }
            while (!isLast) {
                for (int i = 0; i < k; i++) {
                    System.out.print((char) ('A' + arr[i] - 1));
                }
                System.out.println();
                sinh(n, k, arr);
            }
            System.out.println();
        }
    }

    public static int[] sinh(int n, int k, int[] x) {
        int i = k - 1;
        while (i >= 0) {
            if (x[i] < n - k + i + 1) {
                x[i]++;
                break;
            } else {
                i--;
            }
        }
        if (i < 0) {
            isLast = true;
            for (int j = 0; j < k; j++) {
                x[j] = j + 1;
            }
        } else {
            for (int j = i + 1; j < k; j++) {
                x[j] = x[j - 1] + 1;
            }
        }

        return x;

    }
}
