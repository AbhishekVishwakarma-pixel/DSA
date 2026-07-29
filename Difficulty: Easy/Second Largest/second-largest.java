class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int large=0;
        int slarge=-1;
        for(int i=0;i<arr.length;i++){
            if(large<arr[i]){
                large=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(slarge<arr[i] && arr[i]!=large){
                slarge=arr[i];
            }
        }
        return slarge;
    }
}