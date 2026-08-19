class Solution {
    public static int f(int mid,int n){
        int ans=1;
        for(int i=0;i<n;i++){
            ans*=mid;
            
        }
        return ans;
    }
    public int nthRoot(int n, int m) {
        // code here
        if(m==0) return 0;
        int low=1;
        int high=m;
        while(low<=high){
            int mid=(low+high)/2;
            if(f(mid,n)==m) return mid;
            else if(f(mid,n)>m) high=mid-1;
            else low=mid+1;
        }
        return -1;
    }
}