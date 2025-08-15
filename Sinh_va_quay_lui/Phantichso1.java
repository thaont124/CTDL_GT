
/*1.6 
 * O(2^n)
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Phantichso1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int test = scanner.nextInt();
            while (test-- > 0) {
                int n = scanner.nextInt();

                List<List<Integer>> results = analyze(n);
                for (List<Integer> result : results) {
                    System.out.println(result.toString());
                }
            }
        }
    }

    private static List<List<Integer>> analyze(int n) {
        List<List<Integer>> results = new ArrayList<>();
        List<Integer> list = Arrays.asList(n);

        while (list.size() < n) {
            results.add(list);
            list = sinh(n, list);
        }
        results.add(list);
        return results;
    }

    private static List<Integer> sinh(int n, List<Integer> list) {
        list = new ArrayList<>(list);
        int i = list.size() - 1;
        int sum = n;
        while (list.get(i) == 1) {
            sum -= list.get(i);
            list.remove(i);
            i--;
        }
        list.set(i, list.get(list.size() - 1) - 1);
        sum--;
        int need = n - sum;
        int k = list.get(list.size() - 1);
        while (need > 0) {
            if (need - k < 0) {
                k--;
            } else {
                list.add(k);
                need -= k;
            }
        }

        return list;
    }
}
