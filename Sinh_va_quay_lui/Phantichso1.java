
/*1.6 
 * O(n^2)
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Phantichso1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int test = scanner.nextInt();
            while (test-- > 0) {
                int n = scanner.nextInt();

                List<Integer> list = new ArrayList<>();
                list.add(n);
                while (list != null) {
                    System.out.println(list.toString());
                    list = sinh(n, list);

                }
            }
        }
    }

    private static List<Integer> sinh(int n, List<Integer> list) {
        int need = 0;
        while (!list.isEmpty() && list.getLast() == 1) {
            list.removeLast();
            need++;
        }
        if (need == n) {
            return null;
        }
        list.set(list.size() - 1, list.getLast() - 1);
        need++;

        int last = list.getLast();
        while (need > 0) {
            if (need - last >= 0) {
                list.add(last);
                need -= last;
            } else {
                last--;
            }
        }
        return list;

    }
}
