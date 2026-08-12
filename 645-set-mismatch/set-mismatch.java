class Solution {
    public int[] findErrorNums(int[] arr) {
        int n=arr.length;
        long S=0,S2=0;
        long Sn=((long)n*(n+1))/2;
        long S2n=((long)n*(n+1)*(2*n+1))/6;
        for(int i=0;i<n;i++){
            S+=arr[i];
            S2+=(long)arr[i]*arr[i];
        }
        long val1=S-Sn;
        long val2=S2-S2n;
        val2=val2/val1;
        //  x is the repeating number
        long x=(val1+val2)/2;
        //  y is the missing value
        long y=x-val1;
        
        return new int[]{(int)x,(int)y};
    }
}