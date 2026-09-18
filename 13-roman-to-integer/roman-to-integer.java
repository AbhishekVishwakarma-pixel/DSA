class Solution {
    public int romanToInt(String s) {
        int result=value(s.charAt(s.length()-1));
        for(int i=s.length()-2;i>=0;i--){
            if(value(s.charAt(i))<value(s.charAt(i+1))){
                result-=value(s.charAt(i));
            }
            else{
                result+=value(s.charAt(i));
            }
        }
        return result;
    }
    int value(char c){
        if(c=='I') return 1; 
        if(c=='V') return 5;
        if(c=='X') return 10;
        if(c=='L') return 50; 
        if(c=='C') return 100; 
        if(c=='D') return 500;

        return 1000;  
    }
}