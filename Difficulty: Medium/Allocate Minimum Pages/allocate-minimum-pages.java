class Solution {
    boolean isValid(int[] arr,long mid,int k){
        int allocatedSt=1;
        int pages=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mid) return false;
            if(arr[i]+pages>mid){
                allocatedSt++;
                pages=arr[i];
            }
            else pages+=arr[i];
        }
        if(allocatedSt>k) return false;
        return true;
    }
    public int findPages(int[] arr, int k) {
        // code here
        if(arr.length<k) return -1;
        long low=0;
        long high=0;
        for(int i:arr){
            low=Math.max(i,low);
            high+=i;
        }
        while(low<=high){
            long mid=low +(high-low)/2;
            if(isValid(arr,mid,k)){
                high=mid-1;
            }
            else low=mid+1;
        }
        return (int) low;
        
    }
}