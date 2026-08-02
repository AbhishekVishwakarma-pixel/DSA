class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        boolean col0=false;
        
        // Checking that any col is zero or not!
        for(int i=0;i<m;i++){
            if(matrix[i][0]==0) col0=true;
        }

        // marking 1st row and col
        for(int j=1;j<n;j++){
            for(int i=0;i<m;i++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }

            }
        }

        // Marking rows zero
        for(int i=1;i<m;i++){
            if(matrix[i][0]==0)
            for(int j=1;j<n;j++){
                matrix[i][j]=0;
            }
        }

        // making col zero
        for(int j=1;j<n;j++){
            if(matrix[0][j]==0){
                for(int i=1;i<m;i++){
                    matrix[i][j]=0;
                }
            }
        }

        if(matrix[0][0]==0){
            for(int j=1;j<n;j++){
                matrix[0][j]=0;
            }
        }

        if(col0){
            for(int i=0;i<m;i++){
                matrix[i][0]=0;

            }

        }

    }
}