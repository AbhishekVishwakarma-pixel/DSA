class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer>arr=new ArrayList<>();
        int m=nums1.length;
        int n=nums2.length;
        int i=0;
        int j=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                arr.add(nums1[i]);
                i++;
            }
            else if(nums1[i]==nums2[j]){
                arr.add(nums1[i]);
                arr.add(nums1[i]);
                i++;
                j++;
            }
            else{
                arr.add(nums2[j]);
                j++;
            }
        }
        while(i<m){
            arr.add(nums1[i]);
            i++;
        }
        while(j<n){
            arr.add(nums2[j]);
            j++;
        }
        int total=m+n;
        if(total%2!=0) return arr.get(total/2);
        else return (arr.get(total/2)+arr.get(total/2 -1))/2.0;
    }
}