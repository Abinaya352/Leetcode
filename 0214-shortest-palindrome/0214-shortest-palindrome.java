class Solution {
    public String shortestPalindrome(String s) {
        int count = kmp(s);  // We pass only the original string
        return new StringBuilder(s.substring(count)).reverse().toString() + s;
    }

    public int kmp(String original) {
        String reversedString = new StringBuilder(original).reverse().toString();
        String modified = original + "#" + reversedString;  // Modify the string

        int len = modified.length();
        int[] lps = new int[len];  // LPS array
        int i = 1, k = 0;

        while (i < len) {
            if (modified.charAt(i) == modified.charAt(k)) {
                k++;
                lps[i] = k;
                i++;
            } else {
                if (k > 0) {
                    k = lps[k - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        
        return lps[len - 1];  // This gives the longest palindromic prefix length
    }
}
