class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
    int n=arr[0].length;
    int m=arr.length;
    int low=0;
    int high=m*n-1;
    while(low<=high){
        int mid=low +(high-low)/2;
        int x=mid/n;
        int y=mid%n;
        if(arr[x][y]==target) return true;
        else if(arr[x][y]>target) high=mid-1;
        else low=mid+1;
    }
    return false;
    }
}