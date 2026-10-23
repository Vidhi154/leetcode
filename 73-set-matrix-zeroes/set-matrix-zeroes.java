class Solution {

    public void func(int[][] mat, int a, int b, int n, int m){

        for(int i=0;i<n;i++){
            mat[i][b]=0;
        }
        for(int j =0;j<m;j++){
            mat[a][j]=0;
        }
    }
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        List<int[]> hash = new ArrayList<>();
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(matrix[i][j]==0){
                    hash.add(new int[]{i, j});
                }
            }
        }


        for(int[] val : hash){
            func(matrix, val[0], val[1], n, m);
        }
    }
}