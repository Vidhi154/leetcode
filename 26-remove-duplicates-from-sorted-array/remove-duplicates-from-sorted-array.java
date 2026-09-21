class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int right =1;
        int count=1;
        int left =1;
        while(right<len){
            if(nums[right]!=nums[right-1]){
               count++;
               nums[left++]=nums[right];
            }
            right++;
        }

        return count;

    }
}