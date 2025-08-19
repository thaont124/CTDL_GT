/*
 * 1.21
 * O(n)
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Chonsotumatranvuongcapn {
    static int n, k;
    static int[][] a;
    static int[] ddHang, ddCot;
    static List<Integer> result;
    static List<List<Integer>> results;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        k = scanner.nextInt();
        a = new int[n][n];
        ddHang = new int[n];
        ddCot = new int[n];
        result = new ArrayList<>();
        results = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        backTrack(0, k);
        System.out.println(results.size());
        for (List<Integer> e : results) {
            System.out.println(e);
        }
    }

    private static void backTrack(int i, int sum) {

        if (sum == 0 && result.size() == n) {
            results.add(new ArrayList<>(result));
        } else {
            for (int k = 0; k < n; k++) {
                if (ddCot[k] == 0) {
                    if (sum < a[i][k]) {
                        continue;
                    }
                    ddCot[k] = 1;
                    result.add(k + 1);
                    backTrack(i + 1, sum - a[i][k]);
                    ddCot[k] = 0;
                    result.remove(result.size() - 1);

                }

            }
        }

    }
}