/* 
 * 1.9
 * O(n)
 */

import java.util.Scanner;

public class Tapconlienketruoc {
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
        while (x[i] - 1 <= x[i - 1]) {
            i--;
            if (i == 0) {
                break;
            }
        }
        if (i == 0 && x[0] == 1) {
            for (int j = 0; j < k; j++) {
                x[j] = n - k + j + 1;
            }
            return x;
        }

        x[i]--;
        for (int j = i + 1; j < k; j++) {
            x[j] = n - k + j + 1;
        }
        return x;

    }
}
