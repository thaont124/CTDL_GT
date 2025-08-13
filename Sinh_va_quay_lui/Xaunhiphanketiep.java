/*1.1 
 * O(n)
*/

import java.util.Scanner;

public class Xaunhiphanketiep {
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
            if (s[i] == '0') {
                s[i] = '1';
                break;
            } else {
                s[i] = '0';
                i--;
            }
        }
        return new String(s);
    }
}