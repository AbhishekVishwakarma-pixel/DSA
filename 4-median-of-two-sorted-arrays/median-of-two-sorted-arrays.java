class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer>arr=new ArrayList<>();
        int m=nums1.length;
        int n=nums2.length;
        int t=m+n;
        int i=0;
        int j=0;
        int cnt=0;
        int el1=0;
        int el2=0;
        int ind2=t/2;
        int ind1=ind2-1;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
              if(cnt==ind1) el1=nums1[i];
              if(cnt==ind2) el2=nums1[i];
              cnt++;
              i++;
            }
            else{
                if(cnt==ind1) el1=nums2[j];
                if(cnt==ind2) el2=nums2[j];
                j++;
                cnt++;
            }
        }
        while(i<m){
            if(cnt==ind1) el1=nums1[i];
            if(cnt==ind2) el2=nums1[i];
            i++;
            cnt++;
        }
        while(j<n){
            if(cnt==ind1) el1=nums2[j];
            if(cnt==ind2) el2=nums2[j];
            j++;
            cnt++;
        }
        int total=m+n;
        if(total%2!=0) return el2;
        else return (el1+el2)/2.0;
    }
}