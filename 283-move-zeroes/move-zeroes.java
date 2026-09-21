class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int val=0;
        for(int i =0;i<len;i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i]=nums[val];
                nums[val]=temp;
                
                val++;
            }
        }
    }
}