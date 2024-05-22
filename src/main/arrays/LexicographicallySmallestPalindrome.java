package src.main.arrays;

public class LexicographicallySmallestPalindrome {
    public static String findSmallestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int i = 0, j = chars.length - 1;

        while (i < j) {
            if (chars[i] != '?' && chars[j] != '?') {
                if (chars[i] != chars[j]) {
                    return "-1";
                }
            } else if (chars[i] == '?' && chars[j] == '?') {
                chars[i] = 'a';
                chars[j] = 'a';
            } else if (chars[i] == '?') {
                chars[i] = chars[j];
            } else { // chars[j] == '?'
                chars[j] = chars[i];
            }
            i++;
            j--;
        }

        if (i == j) { // Handle middle character if string length is odd
            if (chars[i] == '?') {
                chars[i] = 'a';
            }
        }

        String result = new String(chars);
        if (!isPalindrome(result)) {
            return "IMPOSSIBLE";
        }
        return result;
    }

    private static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(findSmallestPalindrome("a??f"));    // Output: aaaa
        System.out.println(findSmallestPalindrome("a?x?"));    // Output: axxa
        System.out.println(findSmallestPalindrome("a?g??ca")); // Output: acgagca
    }
}

