class Solution {
    public static int firstOccurance(int[] arr,int k){
    int n=arr.length;
    int low=0;
    int high=n-1;
    int lc=-1;
    while(low<=high){
        int mid=(low+high)/2;
        if(arr[mid]==k){
            lc=mid;
            high=mid-1;
        }
        else if(arr[mid]>k){
            high=mid-1;
        }
        else low=mid+1;
    }
    return lc;
    }
    public static int lastOccurance(int[] arr,int k){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int fc=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==k){
                fc=mid;
                low=mid+1;
            }
            else if(arr[mid]<k) low=mid+1;
            else high=mid-1;
        }
        return fc;
    }
    public int[] searchRange(int[] nums, int target) {
        int fc=firstOccurance(nums,target);
        if(fc==-1) return new int[] {-1,-1};
        int lc=lastOccurance(nums,target);
        return new int[]{fc,lc};
        
    }
}