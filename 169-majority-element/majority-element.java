class Solution {
    public int majorityElement(int[] nums) {
        int cnt=0;
        if(nums.length==1) return nums[0];
        for(int i=0;i<nums.length;i++){
            cnt=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    cnt++;
                    if(cnt>nums.length/2){
                        return nums[i];
                    }
                }
            }
        }
        return cnt;
    }
}