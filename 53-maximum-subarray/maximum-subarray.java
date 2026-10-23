class Solution {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int right = 0;
        int left = 0;
        int sum =0;
        int max=Integer.MIN_VALUE;
        while(right<len){
            sum += nums[right];
            max=Math.max(max, sum);
            if(sum<0)
            {
                sum=0;
            }
            right++;

        }

        return max;
    }
}