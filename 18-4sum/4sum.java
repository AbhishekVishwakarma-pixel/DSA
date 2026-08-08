class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> set=new HashSet<>();
        int n=nums.length;

        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                Set<Long> nset=new HashSet<>();
                for(int k=j+1;k<n;k++){
                   long l=(long)target-nums[i]-nums[j]-nums[k];
                   if(nset.contains(l)){
                    List<Integer> temp=new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    temp.add((int)l);
                    Collections.sort(temp);
                    set.add(temp);
                   }
                   nset.add((long)nums[k]);

                }
            }
        }
        return new ArrayList<>(set);
    }
}