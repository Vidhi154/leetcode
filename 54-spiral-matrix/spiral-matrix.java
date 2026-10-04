class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int top =0;
        int bot = n-1;
        int left =0;
        int right = m-1;
        List<Integer> list = new ArrayList<>();

        while(left<=right && top<=bot){


            for(int i = left ;i<=right;i++){
                list.add(matrix[top][i]);
            }

            top++;

            for(int i = top ;i<=bot;i++){
                list.add(matrix[i][right]);
            }

            right--;

            if(top<=bot){
                for(int i = right;i>=left;i--){
                    list.add(matrix[bot][i]);
                }

                bot--;
            }

            if(left<=right){
                for(int i = bot;i>=top;i--){
                    list.add(matrix[i][left]);
                }

                left++;
            }
        }

        

        return list;
    }
}