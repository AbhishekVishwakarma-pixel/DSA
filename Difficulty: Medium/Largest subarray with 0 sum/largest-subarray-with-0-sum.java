class Solution {
    int maxLength(int arr[]) {
        // code here
        Map<Integer,Integer> map=new HashMap<>();
        int maxlen=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==0){
                maxlen=i+1;
            }
            if(map.containsKey(sum)){
                maxlen=Math.max(maxlen,i-map.get(sum));
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return maxlen;
    }
}