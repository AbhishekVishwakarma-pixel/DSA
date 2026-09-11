class Solution {
    public int rowWithMax1s(int[][] arr) {
        // code here
        int ind=-1;
        int maxcnt=0;
        for(int i=0;i<arr.length;i++){
            int cnt=0;
            for(int j=0;j<arr[i].length;j++){
                cnt+=arr[i][j];
            }
            if(cnt>maxcnt){
                maxcnt=cnt;
                ind=i;
            }
        }
        
        return ind;
    }
};