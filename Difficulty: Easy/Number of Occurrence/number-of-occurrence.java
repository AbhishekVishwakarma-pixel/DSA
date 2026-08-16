class Solution {
    public static int fc(int[] arr,int k){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int fc=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==k){
                fc=mid;
                high=mid-1;
            }
            else if(arr[mid]>k) high=mid-1;
            else low=mid+1;
        }
        return fc;
    }
    public static int lc(int[] arr,int k){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int lc=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==k){
                lc=mid;
                low=mid+1;
            }
            else if(arr[mid]<k){
                low=mid+1;
            }
            else high=mid-1;
        }
        return lc;
    }
    int countFreq(int[] arr, int target) {
        // code here
        int fc=fc(arr,target);
        if(fc==-1) return 0;
        int lc=lc(arr,target);
        return (lc-fc+1);
    }
}
