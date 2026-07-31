class Solution {
    public int longestConsecutive(int[] arr) {
        if(arr.length==0)return 0;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        Collections.sort(list);
        int cnt=1;
        int longest=1;
        int lastSecond=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(list.get(i)-1==lastSecond){
                cnt++;
                lastSecond=list.get(i);
            }
            else if(list.get(i)!=lastSecond){
                cnt=1;
                lastSecond=list.get(i);
            }
            longest=Math.max(longest,cnt);
        }
        return longest;
        }
    }
