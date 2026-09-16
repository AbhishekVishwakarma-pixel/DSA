class Solution {
    public String toggleCase(String msg) {
        // code here
       StringBuilder nu= new StringBuilder();
               for(int i=0;i<msg.length();i++){
                   char ch= msg.charAt(i);
                   if(ch>='a' && ch<='z'){
                       ch=(char)(ch-32);
                   }
                   else {
                       ch=(char)(ch+32);
                   }
                   nu.append(ch);
               }
               return nu.toString();
    }
}
