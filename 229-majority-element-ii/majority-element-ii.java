class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int el1=0;
        int el2=0;
        int cnt1=0;
        int cnt2=0;
        for(int i=0;i<nums.length;i++){
            if(cnt1==0 && nums[i]!=el2){
                cnt1=1;
                el1=nums[i];
            }
            else if(cnt2==0 && nums[i]!=el1){
                cnt2=1;
                el2=nums[i];
            }
            else if(nums[i]==el1) cnt1++;
            else if(nums[i]==el2) cnt2++;
            else{
                cnt1--;
                cnt2--;
            }

        }
        int cnt3=0;
        int cnt4=0;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==el1) cnt3++;
            else if(nums[i]==el2) cnt4++;
        }
        if(cnt3>(nums.length)/3) list.add(el1);
        if(cnt4>(nums.length)/3) list.add(el2);

        return list;
    }
}