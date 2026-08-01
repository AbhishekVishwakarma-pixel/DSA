class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[] a=new int[m];
        int[] b=new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    // we are marking one becoz we have not decalred any value when we decalre any an array without giving value it intially store zero !!
                    a[i]=1;
                    b[j]=1;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(a[i]==1 || b[j]==1){
                   matrix[i][j]=0;
                }
            }
        }
        
    }
}