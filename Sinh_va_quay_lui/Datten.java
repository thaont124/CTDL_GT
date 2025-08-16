
/*
 * 1.12
 * O(n.logn + n)
 */
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Datten {
    static boolean isLast = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        Set<String> set = new TreeSet<>();
        int[] index = new int[k];
        for (int i = 0; i < n; i++) {
            set.add(scanner.next());
        }
        for (int i = 0; i < k; i++) {

            index[i] = i + 1;
        }
        String[] x = set.toArray(new String[0]);
        while (!isLast) {
            // System.out.println(Arrays.toString(x) + " " + isLast);

            for (int i = 0; i < k; i++) {
                System.out.print(x[index[i] - 1] + " ");
            }
            index = sinh(x.length, k, index);

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
            isLast = true;
        } else {
            for (int j = i + 1; j < k; j++) {
                x[j] = x[j - 1] + 1;
            }
        }

        return x;

    }
}
