class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int[] hashArray=new int[n+1];

        for(int i=0;i<n;i++){
            hashArray[nums[i]]++;
        }
        int repeating=-1,missing=-1;
        for(int i=1;i<=n;i++){
            if(hashArray[i]==2) repeating=i;
            else if(hashArray[i]==0) missing=i;
            if(missing!=-1 && repeating!=-1) break;
        }
        return new int[]{repeating,missing};
    }
}