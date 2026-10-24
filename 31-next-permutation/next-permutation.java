class Solution {
    public void reverse(int[] nums, int i, int j){
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j]= temp;
            i++;
            j--;
        }
    }
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        int p =0;
        // pivot == right i > right -1;

        // 2 1 5 4 3 0 - right 
        int right = len-1;

        // while(right>0 && nums[right]<=nums[right-1]){
        //     right--;
        // }
        // int pivot = right;
        int pivot =-1;
        for(int i = len-2;i>=0;i--){
            if(nums[i+1]>nums[i]){
                pivot = i;
                break;
            }
        }

        if(pivot==-1){
            reverse(nums, 0, len-1);
            return ;
        }
        //  swap 
        right = len-1;
        while(right>=pivot){
            if(nums[right]>nums[pivot]){
                int temp = nums[pivot];
                nums[pivot] = nums[right];
                nums[right] = temp;
                break;
            }
            right--;
        }

        reverse(nums, pivot+1, len-1);
        return ;

    }
}