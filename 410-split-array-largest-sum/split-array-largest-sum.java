class Solution {
    boolean isValid(int[] arr,long mid,int k){
        int isAllocated=1;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(mid<arr[i]) return false;
            if(arr[i]+sum>mid){
                isAllocated++;
                sum=arr[i];
            }
            else  sum+=arr[i];
        }
        if(isAllocated>k) return false;
        else return true;
    }
    public int splitArray(int[] arr, int k) {
        if(k>arr.length) return -1;
        long low=0;
        long high=0;
        for(int i:arr){
            high+=i;
            low=Math.max(low,i);
        }
        while(low<=high){
            long mid=low+(high-low)/2;
            if(isValid(arr,mid,k)){
                high=mid-1;
            }
            else low=mid+1;
        }
        return (int) low;

    }
}