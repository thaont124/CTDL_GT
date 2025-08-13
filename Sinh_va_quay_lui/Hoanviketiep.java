/*1.3 
 O(n)
*/

import java.util.Scanner;

public class Hoanviketiep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] x = new int[n];
            for (int i = 0; i < n; i++) {
                x[i] = scanner.nextInt();
            }
            x = sinh(n, x);
            for (int i = 0; i < n; i++) {
                System.out.print(x[i] + " ");
            }
            System.out.println();
        }
    }

    public static int[] sinh(int n, int[] x) {
        int len = x.length;
        int i = len - 2;
        while (i >= 0 && x[i + 1] < x[i]) {
            i--;
        }
        if (i < 0) {
            for (int j = 0; j < len; j++) {
                x[j] = j + 1;
            }
        } else {
            int j = len - 1;

            while (x[j] < x[i]) {
                j--;
            }
            int temp = x[i];
            x[i] = x[j];
            x[j] = temp;

            int k = i + 1;
            int l = len - 1;
            while (k < l) {
                temp = x[k];
                x[k] = x[l];
                x[l] = temp;

                k++;
                l--;
            }
        }

        return x;
    }
}
