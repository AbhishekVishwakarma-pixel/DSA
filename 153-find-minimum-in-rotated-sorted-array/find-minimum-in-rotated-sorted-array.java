class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        int ans=Integer.MAX_VALUE;
        int val=Integer.MAX_VALUE;

        while(low<=high){
            int mid=(low+high)/2;
            if(nums[low]<=nums[mid]){
                val=nums[low];
                low=mid+1;
            }
            else{
                val=nums[mid];
                high=mid-1;
            }
            ans=Math.min(ans,val);
        }
        return ans;    
    }
    
}