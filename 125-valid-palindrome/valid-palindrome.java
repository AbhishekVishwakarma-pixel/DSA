class Solution {
    // Abhishek
    public static boolean palindrome(int i,String a){
        int n=a.length();
        if(i>=n/2) return true;
        if(a.charAt(i)!=a.charAt(n-i-1)) return false;
        return palindrome(i+1,a);
    }
    public boolean isPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
       return palindrome(0,s);
        
    }
}