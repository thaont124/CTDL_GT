
/*1.10
 * O(n)
*/
import java.util.Arrays;
import java.util.Scanner;

public class Sothutuhoanvi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] arr = new int[n];
            int count = 1;
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
                arr[i] = i + 1;
            }
            while (true) {
                if (Arrays.equals(a, arr)) {
                    System.out.println(count);
                    break;
                } else {
                    arr = sinh(n, arr);
                    count++;
                }

            }

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
