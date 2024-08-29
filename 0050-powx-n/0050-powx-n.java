class Solution {
    public double myPow(double x, int n) {
        // Handle the base cases
        if (n == 0) {
            return 1;
        }
        
        // Convert n to a long to handle the case where n = Integer.MIN_VALUE
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        
        double result = 1;
        double current_product = x;
        
        while (N > 0) {
            if ((N % 2) == 1) {  // If N is odd
                result *= current_product;
            }
            current_product *= current_product;  // Square the base
            N /= 2;  // Divide N by 2
        }
        
        return result;
    }
}
