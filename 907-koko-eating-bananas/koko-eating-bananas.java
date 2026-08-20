class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        for(int pile:piles){
            high=Math.max(pile,high);
        }

        while(low<=high){
            int k=low + (high-low)/2;
            long hours=0;
            for(int pile :piles){
                hours+=(pile+(long)k-1)/k;
            }
            // The number of hours is more that means speed of eating banana's per hour is less
            if(hours<=h) high=k-1;
            // The number of hours is less that means speed of eating banana's per hour is more
            else low=k+1;
        }
        return low;
    }
}