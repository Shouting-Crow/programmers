class Solution {
    public int solution(int[][] dots) {
        int a = 0;
        int b = 0;

        for (int i = 1; i < dots.length; i++) {
            if (dots[i][0] == dots[0][0]) a = dots[0][1] - dots[i][1];
            else if (dots[i][1] == dots[0][1]) b = dots[0][0] - dots[i][0];
        }

        return Math.abs(a * b);
    }
}