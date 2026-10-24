class Solution {
    public void sortColors(int[] nums) {
        int len = nums.length;
        int one =0;
        int mid = 0;
        int last = len-1;

        int right =0;
        while(right<=last){
            if(nums[right]==1){
                mid++;
                right++;

            }else if(nums[right]==0){
                int temp = nums[right];
                nums[right ] = nums[one];
                nums[one]= temp;
                one++;
                right++;
            }else{
                int temp = nums[last];
                nums[last] = nums[right];
                nums[right]= temp;
                last--;
            }
        }
    }
}