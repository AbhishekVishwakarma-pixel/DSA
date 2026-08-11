class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int r=-1,m=-1;
        for(int i=1;i<=n;i++){
            int cnt=0;
            for(int j=0;j<n;j++){
                if(nums[j]==i){
                    cnt++;
                }
            }
            if(cnt==0) m=i;
            else if(cnt==2) r=i; 
            if(m!=-1 && r!=-1) break;
        }
        int[] arr={r,m};
        return arr;
    }
}