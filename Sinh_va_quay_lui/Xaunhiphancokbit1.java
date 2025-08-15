
/*1.4 
 * O(2^n)
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Xaunhiphancokbit1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            System.out.println(generateAB(n, k));
        }
    }

    private static List<String> generateAB(int n, int k) {
        List<String> results = new ArrayList<>();
        String str = "";
        for (int i = 0; i < n; i++) {
            str += "0";
        }
        while (!results.contains(str)) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '1') {
                    count++;
                    if (count > k) {
                        break;
                    }
                }
            }
            if (count == k) {
                results.add(str);
            }
            str = sinh(str, n);
        }

        return results;
    }

    public static String sinh(String s, int length) {
        int i = length - 1;
        while (i >= 0) {
            if (s.charAt(i) == '0') {
                s = s.substring(0, i) + '1' + s.substring(i + 1);
                break;
            } else {
                s = s.substring(0, i) + '0' + s.substring(i + 1);
                i--;
            }
        }
        return s;
    }
}
