class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
       Map<Integer,Integer> map=new HashMap<>();
       int cnt=0;
       int xor=0;
       
       map.put(0,1);
       for(int i=0;i<arr.length;i++){
           xor^=arr[i];
           int required=xor^k;
           
           if(map.containsKey(required)){
               cnt+=map.get(required);
           }
           map.put(xor,map.getOrDefault(xor,0)+1);
       }
        return cnt;
    }
}