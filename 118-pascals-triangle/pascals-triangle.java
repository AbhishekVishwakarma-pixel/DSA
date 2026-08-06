class Solution {
    public static List<Integer> Row(int n){
        int res=1;
        List<Integer>list=new ArrayList<>();
        list.add(1);
        for(int i=1;i<n;i++){
            res=res*(n-i)/i;
            
            list.add(res);
        }
        return list;

    }
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> nlist=new ArrayList<>();
        for(int i=1;i<=n;i++){

            nlist.add(Row(i));
        }
        return nlist;
    }
}