class Solution {


    public int func(int[] nums,int l , int r, int mid){
        int left = l;
        int right = mid+1;
        int ans =0;

        while(left<=mid){
            while(right<=r && (long) nums[left]>nums[right]*2L){
                right++;
            }
            left++;
            ans+= right- (mid+1);
        }


        // while(left>=mid){}

        // int ans = right-mid+1;
        return ans;
    }


    public int sort(int[] nums, int l, int r , int mid){
        int[] temp= new int[r-l+1];
        int left =l;
        int right = mid+1;
        int k =0;
        int ans =0;
        ans += func(nums, l, r, mid);
        while(left<=mid && right <=r){
            if(nums[left]<=nums[right]){
                temp[k++] = nums[left++];
            }else{
               
                temp[k++] = nums[right++];
            }
        }

        while(left<=mid){
            temp[k++] = nums[left++];
        }

        while(right<=r){
            temp[k++] = nums[right++];
        }

        System.arraycopy(temp, 0 , nums, l, temp.length );
        return ans;
    }

    public int merge(int[] nums, int l, int r){
        if(l>=r){
            return 0;
        }

        int mid = (l+r)/2;
        int ans=0;
        ans +=merge(nums, l,mid);
        ans+=merge(nums , mid+1, r);
        ans+=sort(nums, l , r, mid);
        return ans;
    }
    public int reversePairs(int[] nums) {
        int ans = merge(nums, 0, nums.length-1);
        return ans;
    }
}