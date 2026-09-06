class Solution {
    boolean canWePlace(int[] arr,int dist,int cows){
        int count=1;
        int last=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-last>=dist){
                count++;
                last=arr[i];
            }
            if(count>=cows)return true;
        }
        return false;
    }
    public int maxDistance(int[] arr, int k) {
        Arrays.sort(arr);
       int low=1;
       int high=arr[arr.length-1]-arr[0]; 
       while(low<=high){
        int mid=low +(high-low)/2;
        if(canWePlace(arr,mid,k)){
            low=mid+1;
        }
        else high=mid-1;
       }
       return high;
    }
}