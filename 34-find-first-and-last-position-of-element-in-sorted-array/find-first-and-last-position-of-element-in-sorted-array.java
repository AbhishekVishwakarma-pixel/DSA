class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        int low=0;
        int n=arr.length;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=target){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }    
   
    int upperBound(int[] arr, int target) {
        // code here
        int low=0;
        int n=arr.length;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
}

    public int[] searchRange(int[] nums, int target) {
      int lb=lowerBound(nums,target);
      int[] arr={-1,-1};
      if(lb==nums.length ||nums[lb]!=target) return arr;
      arr[0]=lb;
      arr[1]=upperBound(nums,target)-1;      
      return arr;
    }
}