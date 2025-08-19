
/*1.17
 * O(n)
*/
import java.util.Scanner;

public class Hoanvixaukitu {
    static boolean isLast;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            isLast = false;
            String x = scanner.next();
            int[] arr = new int[x.length()];
            for (int i = 0; i < x.length(); i++) {
                arr[i] = i + 1;
            }
            while (!isLast) {
                for (int i = 0; i < x.length(); i++) {
                    System.out.print(x.charAt(arr[i] - 1));
                }
                System.out.print(" ");
                arr = sinh(x.length(), arr);
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
