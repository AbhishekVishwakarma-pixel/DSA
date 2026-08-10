class Solution {
    public int[][] merge(int[][] arr) {
        // in this a and b are the intverals and it Sorts intervals by their starting value
        Arrays.sort(arr,(a,b) -> a[0]-b[0]);
    
        int n=arr.length;
        int start=arr[0][0];
        int end=arr[0][1];
        List<int[]> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i][0]<=end){
                end=Math.max(end,arr[i][1]);
            }
            else{
                list.add(new int[]{start,end});
                start=arr[i][0];
                end=arr[i][1];
            }
        }
        list.add(new int[]{start,end});
        return list.toArray(new int[list.size()][]);
    }
}