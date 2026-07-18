class Solution {
    public void print(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        print(n-1);
    }
    void printNos(int n) {
        // code here
        print(n);
    }
}