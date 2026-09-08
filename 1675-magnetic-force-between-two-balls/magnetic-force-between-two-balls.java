class Solution {
    boolean canWePlace(int[] arr,long dist,int cows){
        int count=1;
        int last=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-last>=dist){
                count++;
                last=arr[i];
            }
            if(count>=cows) return true;
        } 
        return false;
    }
    public int maxDistance(int[] arr, int cows) {
        Arrays.sort(arr);
        long low=1;
        long high=arr[arr.length-1]-arr[0];
        while(low<=high){
            long mid=low+(high-low)/2;
            if(canWePlace(arr,mid,cows)){
                low=mid+1;
            }
            else high=mid-1;
        }
        return (int)high;

    }
}