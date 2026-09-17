class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character,Character> st=new HashMap<>();
        Map<Character,Character> ts=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(st.containsKey(s.charAt(i))){
                if(st.get(s.charAt(i))!=t.charAt(i)) return false;
            }
            else st.put(s.charAt(i),t.charAt(i));
            if(ts.containsKey(t.charAt(i))){
                if(ts.get(t.charAt(i))!=s.charAt(i)) return false;
            }
            else ts.put(t.charAt(i),s.charAt(i));
        }
        return true;
    }
}