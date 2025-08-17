
/*
 * 1.15
 * O(n)
 */
import java.util.Scanner;

public class Hoanvidayso {
    static boolean isLast = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] x = new int[n];
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
            arr[i] = i + 1;
        }
        while (!isLast) {
            for (int i = 0; i < n; i++) {
                System.out.print(x[arr[i] - 1] + " ");
            }
            System.out.println();
            arr = sinh(n, arr);
        }

    }

    public static int[] sinh(int n, int[] x) {
        int len = x.length;
        int i = len - 2;
        while (i >= 0 && x[i + 1] < x[i]) {
            i--;
        }
        if (i < 0) {
            isLast = true;
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
