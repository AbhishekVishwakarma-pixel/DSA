class Solution {
    public boolean checkPerfectNumber(int n) {
                if (n <= 1) return false;

        int num = 1;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                num += i;
            }
        }

        return num == n;
    }
}