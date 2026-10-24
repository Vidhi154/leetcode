class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int len = nums.length;
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i =0;i<len;i++){
             if(i>0 && nums[i]==nums[i-1]){
                    continue;
                }
            for(int j = i+1;j<len;j++){
               
               if(j>i+1 && nums[j]==nums[j-1]){
                continue;
               }

                // if(j>i && nums[j]==nums[j-1]){
                //     continue;
                // }

                int u = j+1;
                int v = len-1;
                while(u<v){
                    long sum = (long)nums[i] + nums[j] + nums[u] + nums[v];
                    if(sum>target){
                        v--;
                    }else if(sum<target){
                        u++;
                    }else{
                        list.add(Arrays.asList(nums[i] , nums[j], nums[u] , nums[v]));


                        u++;
                        v--;
                        while(u<v && nums[u]==nums[u-1]){
                            u++;
                        }

                        while(v>u && nums[v]==nums[v+1]){
                            v--;
                        }

                    }
                }

               

            }
        }

         return list;
    }
}