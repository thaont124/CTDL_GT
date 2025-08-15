/*1.9 
 * O(2^n)
*/

import java.util.Scanner;

public class Tohoptieptheo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] x = new int[k];
            int[] arr = new int[n];
            for (int i = 0; i < k; i++) {
                x[i] = scanner.nextInt();
                arr[i] = x[i];
            }

            x = sinh(n, k, x);
            int count = 0;
            for (int i = 0; i < k; i++) {

                if (x[i] != arr[i]) {
                    count++;
                }
            }
            System.out.println(count);
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
