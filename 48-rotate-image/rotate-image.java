class Solution {

    
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        // transpose
        for(int i =0;i<n;i++){
            for(int j =0;j<i;j++){
                if(i!=j){
                    int temp = matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
        }


        for(int i =0;i<m;i++){
            int right =0;
            int left = n-1;
            while(right<=left){
                int temp= matrix[i][right];
                matrix[i][right]= matrix[i][left];
                matrix[i][left]=temp;
                right++;
                left--;
            }
        }




    }
}