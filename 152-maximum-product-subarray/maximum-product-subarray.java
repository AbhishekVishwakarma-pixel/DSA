
class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==1) return nums[0];
        int pre=1,suff=1;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(pre==0) pre=1;
            if(suff==0) suff=1;
            pre*=nums[i];
            suff*=nums[nums.length-1-i];
            ans=Math.max(ans,Math.max(pre,suff));
        }
        return ans;

    }
}