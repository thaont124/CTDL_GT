
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

            while (j > i) {
                int min_idx = j;

                for (int k = i + 1; k < len; k++) {
                    if (x[k] < x[min_idx]) {
                        min_idx = k;
                    }
                }
                int temp = x[i];
                x[i] = x[min_idx];
                x[min_idx] = temp;

                i++;
            }

        }

        return x;
    }
}
