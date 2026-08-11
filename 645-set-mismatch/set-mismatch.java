class Solution {
    public int[] findErrorNums(int[] nums) {
       Map<Integer,Integer> map=new HashMap<>();
       int n=nums.length;
       for(int i=1;i<=n;i++){
        map.put(i,0);
       } 
       for(int i=0;i<n;i++){
        map.put(nums[i],map.get(nums[i
        ])+1);
       }
       int[] arr=new int[2];
       for(int i=1;i<=n;i++){
        if(map.get(i)==2) arr[0]=i;
        if(map.get(i)==0) arr[1]=i;
       }
       return arr;
    }
}