class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        int num =nums[0];
        int count =1;
        int right =1;
        int ans=-1;
        while(right<len){
            if(nums[right]==num){
                count++;
            
            }else{
                count--;
            }

            if(count==0){
                count =1;
                num= nums[right];
            }
            
            right++;
        }

        return num;
    }
}