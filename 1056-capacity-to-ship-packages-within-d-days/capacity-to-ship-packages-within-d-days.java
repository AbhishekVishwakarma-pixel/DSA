class Solution {
    int fun(int [] weight,int cap){
        int days=1;
        int load=0;
        for(int i=0;i<weight.length;i++){
            if(load+weight[i]>cap){
                days=days+1;
                load=weight[i];
            }
            else{
                load+=weight[i];
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int w:weights){
            low=Math.max(low,w);
            high+=w;
        }
        while(low<=high){
            int mid=(low+high)/2;
            if(fun(weights,mid)<=days){
                high=mid-1;
            }
            else low=mid+1;
        }
        
        return low;
    }
}