class Solution {
    public int rowWithMax1s(int[][] arr) {
        // code here
        int maxcnt=0;
        int index=-1;
        for(int i=0;i<arr.length;i++){
            int cnt=0;
            for(int j=0;j<arr[0].length;j++){
                cnt+=arr[i][j];
                if(cnt>maxcnt){
                    maxcnt=cnt;
                    index=i;
                }
            }
        }
        return index;
    }
};