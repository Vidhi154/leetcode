class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        List<List<Integer>> l = new ArrayList<>();
        HashSet<List<Integer>> list = new HashSet<>();
        Arrays.sort(nums);
        for(int i =0;i<len-2;i++){
            // if/()
            int j = i+1;
            int k = len-1;
            while(j<k){
                int sum = nums[i] + nums[k] + nums[j];
                
             

                if(sum<0){
                    if(j+1<k) j++;
                    else{
                        break;
                    }
                    
                }else if(sum>0 ){
                    if (k-1>j)k--;
                    else{
                        break;
                    }
                }else{
                    list.add( Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }
            }
        }

        return new ArrayList<>(list);
    }
}