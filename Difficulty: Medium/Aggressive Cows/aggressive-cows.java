class Solution {
    public boolean canWePlace(int[] arr,int dist,int cows){
        int count=1;
        int last=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-last>=dist){
                count++;
                last=arr[i];
            }
            if(count>=cows) return true;
        }
        return false;                     
    }
    public int aggressiveCows(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int max=arr[0];
        int min=arr[0];
        for(int i:arr){
            max=Math.max(i,max);
            min=Math.min(i,min);
        }
        int ans=0;
        for(int i=1;i<=max-min;i++){
            if(canWePlace(arr,i,k)){
                ans=i;
            }
            else break;
        }
        return ans;
    }
}