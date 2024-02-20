class Solution {
    public int reverse(int x) {
        int reversed = 0;
        while(x != 0){
            int last_Digit = x % 10;
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && last_Digit > 7)) {
                return 0; // Return 0 if reversing causes overflow
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && last_Digit < -8)) {
                return 0; // Return 0 if reversing causes underflow
            }
            
            reversed = reversed * 10 + last_Digit;
            x = x / 10;
        }
        return reversed;
        
    }
}