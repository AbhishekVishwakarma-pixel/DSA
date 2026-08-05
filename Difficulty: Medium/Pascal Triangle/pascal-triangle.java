class Solution {
    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        int res=1;
        for(int i=1;i<n;i++){
            res=res*(n-i);
            res=res/i;
            list.add(res);
        }
        return list;
    }
}