class Solution {
    public static int f(int k){
        if(k<=1) return k;
        int last=f(k-1);
        int slast=f(k-2);
        return last +slast;

    } 
    public int fib(int n) {
      return f(n);
    }
}