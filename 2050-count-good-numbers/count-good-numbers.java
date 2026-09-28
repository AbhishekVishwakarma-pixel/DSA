class Solution {
    int MOD=1000000007;
    long solve(long x,long n){
        if(n==0) return 1;
        if(n%2==0) return solve((x*x)%MOD,n/2);
        return (x*solve((x*x)%MOD,(n-1)/2))%MOD;

    }
    public int countGoodNumbers(long n) {
     long res= (solve(5,(n+1)/2)*solve(4,n/2))%MOD;
     return (int)res;   
    }
}