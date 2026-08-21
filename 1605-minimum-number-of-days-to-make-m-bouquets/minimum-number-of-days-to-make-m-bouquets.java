class Solution {
    boolean canMake(int[] bloomDay,int m,int k,int day){
        int flowers=0;
        int bouquets=0;
        for(int bloom :bloomDay){
            if(bloom<=day){
                flowers++;

                if(flowers==k){
                    flowers=0;
                    bouquets++;
                }
            }
            else flowers=0;
        }
        return bouquets>=m;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        int low=1;
        int high=0;
        if((long)m*k>bloomDay.length) return -1;
        for(int day :bloomDay){
            low=Math.min(low,day);
            high=Math.max(high,day);
        }
        while(low<=high){
            int mid=low +(high-low)/2;
            if(canMake(bloomDay,m,k,mid)){
                high=mid-1;
            }
            else low=mid+1;
        }
        return low;
    }
}