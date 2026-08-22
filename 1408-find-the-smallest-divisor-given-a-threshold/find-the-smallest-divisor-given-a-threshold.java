class Solution {
    int sum(int[] arr,int k){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=Math.ceil((double)arr[i]/k);
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=0;
        for(int d :nums){
            high=Math.max(d,high);
        }
        int sum=0;
        while(low<=high){
            int k=low+(high-low)/2;
            if(sum(nums,k)<=threshold){
                high=k-1;
            }
            else low=k+1;
        }
        return low;
    }
}