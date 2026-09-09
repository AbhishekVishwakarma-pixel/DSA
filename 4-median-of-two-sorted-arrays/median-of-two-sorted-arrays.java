class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer>arr=new ArrayList<>();
        int m=nums1.length;
        int n=nums2.length;
        for(int i=0;i<m;i++){
            arr.add(nums1[i]);
        }
        for(int i=0;i<n;i++){
            arr.add(nums2[i]);
        }
        int total=m+n;
        Collections.sort(arr);
        if(total%2!=0) return arr.get(total/2);
        else return (arr.get(total/2)+arr.get(total/2 -1))/2.0;
    }
}