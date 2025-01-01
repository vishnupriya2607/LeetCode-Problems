class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        
        int n = s.length();
        boolean[][] dp = new boolean[n][n]; // DP table to store palindrome information
        int start = 0; // Start index of the longest palindromic substring
        int maxLen = 1; // Length of the longest palindromic substring
        
        // Every single character is a palindrome
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }
        
        // Check for two-character substrings
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                start = i;
                maxLen = 2;
            }
        }
        
        // Check for palindromes of length 3 and greater
        for (int length = 3; length <= n; length++) {
            for (int i = 0; i < n - length + 1; i++) {
                int j = i + length - 1;
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    start = i;
                    maxLen = length;
                }
            }
        }
        
        // Return the longest palindromic substring
        return s.substring(start, start + maxLen);
    }
}
