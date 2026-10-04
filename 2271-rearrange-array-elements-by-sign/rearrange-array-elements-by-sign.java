class Solution {
    public int[] rearrangeArray(int[] nums) {
        int len= nums.length;
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for(int i =0;i<len;i++){
            if(nums[i]>=0){
                even.add(nums[i]);
            }else{
                odd.add(nums[i]);
            }
        }
        int[] ans = new int[len];
        int j =0;
        for(int i =0;i<len/2;i++){
            ans[j++]=even.get(i);
            ans[j++] = odd.get(i);
        }

        return ans;
    }
}