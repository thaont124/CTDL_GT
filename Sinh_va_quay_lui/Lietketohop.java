
/*
 * 1.16
 * O(nlogn + n)
 */
import java.util.Scanner;
import java.util.TreeSet;

public class Lietketohop {
    static boolean isLast = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            set.add(scanner.nextInt());
        }
        int[] arr = set.stream().mapToInt(Integer::intValue).toArray();
        int[] index = new int[k];
        for (int i = 0; i < k; i++) {
            index[i] = i + 1;
        }
        while (!isLast) {
            for (int i = 0; i < k; i++) {
                System.out.print(arr[index[i] - 1] + " ");
            }
            System.out.println();
            index = sinh(set.size(), k, index);
        }
        System.out.println();

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
