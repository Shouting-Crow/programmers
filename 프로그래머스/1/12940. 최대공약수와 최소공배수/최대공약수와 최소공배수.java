class Solution {
    public int[] solution(int n, int m) {
        int max = 1, min = 0;

        for (int i = 1; i <= n && i <= m; i++) {
            if (n % i == 0 && m % i == 0) {
                max = i;
            }
        }

        min = n * m / max;

        return new int[]{max, min};
    }
}