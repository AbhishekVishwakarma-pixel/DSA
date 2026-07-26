class Solution {
    public void print(int k,int n)
    {
        if(k>n) return;
        System.out.print(k+" ");
        print(k+1,n);
        
    }
    public void printTillN(int n) {
        // code here
        print(1,n);
    }
}