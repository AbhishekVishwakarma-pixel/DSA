class Solution {
    public boolean isPalindrome(int x) {
         if (x < 0) {
            return false;
        }
        long num=0;
        int rem=0;
        int y=x;
        while(y>0){
            rem=y%10;
            y=y/10;
            num=num*10+rem;
        }
        // if(num>Integer.MAX_VALUE || num<Integer.MIN_VALUE) return false;
        
        if(num==x) return true;
        return false;
    }
}