
/*1.8
 * O(n)
*/
import java.util.Scanner;

public class Xaunhiphantruoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            char[] s = scanner.next().toCharArray();
            int length = s.length;
            System.out.println(sinh(s, length));
        }
    }

    public static String sinh(char[] s, int length) {
        int i = length - 1;
        while (i >= 0) {
            if (s[i] == '1') {
                s[i] = '0';
                break;
            } else {
                s[i] = '1';
                i--;
            }
        }
        return new String(s);
    }
}
