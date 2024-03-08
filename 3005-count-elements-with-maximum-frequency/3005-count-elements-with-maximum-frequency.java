class Solution {
    public int maxFrequencyElements(int[] nums) {
        int largest = 0;
        for (int i = 0; i < nums.length; i++) {
            largest = Math.max(largest, nums[i]);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        int max = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
            }
        }
        
        int frequency = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] == max) {
                frequency++;
            }
        }
        return max * frequency;
    }
}
