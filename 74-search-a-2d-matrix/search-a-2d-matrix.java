class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int m=arr[0].length;
        int n=arr.length;
        int low=0;
        int high=m*n-1;
        while(low<=high){
            int mid=low +(high-low)/2;
            int x=mid/m;
            int y=mid%m;
            if(arr[x][y]==target) return true;
            if(arr[x][y]>target) high=mid-1;
            else low=mid+1;
        }
        return false;
    }
}