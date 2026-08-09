class Solution {
    public int peakIndexInMountainArray(int[] arr) {
     int value=arr[0];
     int track=0;
     for(int i=0;i<arr.length;i++){
        if(value<arr[i]){
            value=arr[i];
            track=i;
        }
     }   
     return track;
    }
}