/*1.2 */

import java.util.Scanner;

public class Tapconketiep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] x = new int[k];
            for (int i = 0; i < k; i++) {
                x[i] = scanner.nextInt();
            }
            x = sinh(n, k, x);
            for (int i = 0; i < k; i++) {
                System.out.print(x[i] + " ");
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
