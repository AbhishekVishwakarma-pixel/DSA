class Solution {
    public List<Integer> majorityElement(int[] n) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n.length;i++){
            if(map.containsKey(n[i])){
               map.put(n[i],map.get(n[i])+1); 
            }
            else{
                map.put(n[i],1);
            }
        }
        List<Integer> list=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry :map.entrySet()){
            if(entry.getValue()>(n.length/3)){
                list.add(entry.getKey());
            }
        }
        return list;
    }
}