class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Iterate through digits from right to left
        for (int i = n - 1; i >= 0; i--) {
            // If the current digit is less than 9, simply increment and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                // Set the current digit to 0 and continue with the next digit
                digits[i] = 0;
            }
        }

        // If there is still a carry, create a new array with one additional digit
        int[] result = new int[n + 1];
        result[0] = 1;

        return result;
    }
}
