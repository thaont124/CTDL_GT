
/*
 * 1.14
 * O(n)
 */
import java.util.Scanner;

public class Phatloc {
    static boolean isLast = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 6) {
            return;
        }
        char[] s = new char[n];
        for (int i = 0; i < n; i++) {
            s[i] = '6';
        }
        s[0] = '8';
        while (!isLast) {
            s = sinh(s, n);
            if (isPhatLoc(s)) {
                System.out.println(new String(s));
            }
        }

    }

    public static char[] sinh(char[] s, int length) {
        int i = length - 1;
        while (i >= 0) {
            if (s[i] == '6') {
                s[i] = '8';
                break;
            } else {
                s[i] = '6';
                i--;
            }
        }
        if (i < 0) {
            isLast = true;
        }
        return s;
    }

    public static boolean isPhatLoc(char[] s) {
        if (s.length < 6) {
            return false;
        }
        if (s[0] != '8') {
            return false;
        }
        if (s[s.length - 1] != '6') {
            return false;
        }
        int count6 = 0;
        int count8 = 0;
        for (int i = 0; i < s.length; i++) {
            if (count6 > 3 || count8 >= 2) {
                return false;
            }
            if (s[i] == '6') {
                count6++;
                count8 = 0;
            } else {
                count6 = 0;
                count8++;
            }
        }

        return true;
    }
}
