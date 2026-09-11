class Solution {
   boolean findElem(int[] arr,int n,int target){
       int low=0;
       int high=n-1;
       while(low<=high){
           int mid=low +(high-low)/2;
           if(arr[mid]==target) return true;
           else if(arr[mid]>target) high=mid-1;
           else low=mid+1;
       }
       return false;
   }
   public boolean searchMatrix(int[][] arr, int target) {
       int m=arr[0].length;
       for(int i=0;i<arr.length;i++){
           if(arr[i][0]<=target && arr[i][m-1]>=target){
               if(findElem(arr[i],m,target)) return true;
           }
       }
       return false;
   }
}
