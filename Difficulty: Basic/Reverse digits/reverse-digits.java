class Solution {
    public int reverseDigits(int x) {
        // Code here
        int num=0;
      int n=x;
      if(n==0) return 0;
      while(n>0 ||n<0){
        num=num*10+n%10;
        n=n/10;
      }  
      return num;
    }
}