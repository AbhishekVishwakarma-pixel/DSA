class Solution {
    public static int fact(int n,int r){
        int res=1;
        for(int i=1;i<=r;i++){
            res=res*(n-i+1);
            res=res/i;
        }
        return res;
        
    }
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            List<Integer> nlist =new ArrayList<>();
            for(int j=1;j<=i;j++){
               nlist.add(fact(i-1,j-1)); 
            }
            list.add(nlist);
        }
        return list;
    }
}