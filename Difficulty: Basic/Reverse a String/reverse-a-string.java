class Solution {
    public static String reverseString(String s) {
        // code here
        StringBuilder st=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            st.append(s.charAt(i));
        }
        return st.toString();
    }
}