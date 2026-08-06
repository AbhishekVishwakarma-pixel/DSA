class Solution {
    public List<Integer> majorityElement(int[] nums) {

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            // Avoid adding the same element multiple times
            if (ans.contains(nums[i])) continue;

            int cnt = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    cnt++;
                }
            }

            if (cnt > nums.length / 3) {
                ans.add(nums[i]);
            }
        }

        return ans;
    }
}