class Solution {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int max = Integer.MIN_VALUE;
        int sum =0;
        for(int i =0;i<len;i++){
            sum += nums[i];
            max=Math.max(sum, max);
            sum = Math.max(0, Math.max(sum, nums[i]));
        }

        return max;
    }
}