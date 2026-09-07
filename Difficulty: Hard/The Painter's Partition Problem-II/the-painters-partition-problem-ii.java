class Solution {
    boolean isValid(int[] arr,long mid,int k){
        int isAllocated=1;
        int time=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mid) return false;
            if(arr[i]+time>mid){
                isAllocated++;
                time=arr[i];
            }
            else time+=arr[i];
        }
        if(isAllocated>k) return false;
        return true;
    }
    public int minTime(int[] arr, int k) {
        // code here
        long low=0;
        long high=0;
        for(int i:arr){
            low=Math.min(low,i);
            high+=i;
        }
        while(low<=high){
            long mid=low+(high-low)/2;
            if(isValid(arr,mid,k)){
                high=mid-1;
            }
            else low=mid+1;
        }
        return (int)low;
    }
}
