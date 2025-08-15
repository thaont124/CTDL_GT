
/*1.4 
 * O(2^n)
*/
import java.util.Scanner;

public class XauABDoDaiN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            // Initialize the string with 'A's and 'B's
            String s = "";
            for (int i = 0; i < n; i++) {
                s += "A";
            }
            for (int i = 0; i < Math.pow(2, n); i++) {
                System.out.print(s + " ");
                s = sinh(s, n);
            }
            System.out.println();
        }
    }

    public static String sinh(String s, int length) {
        int i = length - 1;
        while (i >= 0) {
            if (s.charAt(i) == 'A') {
                s = s.substring(0, i) + 'B' + s.substring(i + 1);
                break;
            } else {
                s = s.substring(0, i) + 'A' + s.substring(i + 1);
                i--;
            }
        }
        return s;
    }
}