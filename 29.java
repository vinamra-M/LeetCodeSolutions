class Solution {
    public int divide(int dividend, int divisor) {    
        // Handle overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        
        // Determine the sign of the quotient
        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;
        
        // Convert dividend and divisor to positive long integers
        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);
        
        // Perform bitwise division
        int quotient = 0;
        while (absDividend >= absDivisor) {
            long temp = absDivisor;
            int shift = 0;
            
            while ((temp << 1) <= absDividend) {
                temp <<= 1;
                shift++;
            }
            
            absDividend -= temp;
            quotient += 1 << shift;
        }
        
        return sign * quotient;
    }
}
