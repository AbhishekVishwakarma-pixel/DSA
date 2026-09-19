class Solution {
    int value(char ch){
        if(ch=='I') return 1;
        if(ch=='V') return 5;
        if(ch=='X') return 10;
        if(ch=='L') return 50;
        if(ch=='C') return 100;
        if(ch=='D') return 500;
        return 1000;

    }
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
}