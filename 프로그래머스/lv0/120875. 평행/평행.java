class Solution {
    public int solution(int[][] dots) {
        int answer = 0;

        if (dots[0][0] == dots[1][0] && dots[0][1] == dots[1][1] && (dots[2][1] == dots[3][1]) && (dots[2][0] == dots[3][0]) ||
                dots[0][0] == dots[2][0] && dots[0][1] == dots[2][1] && (dots[1][1] == dots[3][1]) && (dots[1][0] == dots[3][0]) ||
                dots[0][0] == dots[3][0] && dots[0][1] == dots[3][1] && (dots[1][1] == dots[2][1]) && (dots[1][0] == dots[2][0]))
            return 1;

        boolean slopeA =  ((double)(dots[0][1] - dots[1][1]) / (dots[0][0] - dots[1][0]) ==
                ((double)(dots[2][1] - dots[3][1]) / (dots[2][0] - dots[3][0])));
        boolean slopeB =  (double)(dots[0][1] - dots[2][1]) / (dots[0][0] - dots[2][0]) ==
                (double)(dots[1][1] - dots[3][1]) / (dots[1][0] - dots[3][0]);
        boolean slopeC =  (double)(dots[0][1] - dots[3][1]) / (dots[0][0] - dots[3][0]) ==
                (double)(dots[1][1] - dots[2][1]) / (dots[1][0] - dots[2][0]);

        if (slopeA || slopeB || slopeC) return 1;

        boolean parallelX = (dots[0][1] == dots[1][1] && dots[1][1] == dots[2][1] && dots[2][1] == dots[3][1]);
        boolean parallelY = (dots[0][0] == dots[1][0] && dots[1][0] == dots[2][0] && dots[2][0] == dots[3][0]);

        if (parallelX || parallelY) return 1;

        return answer;
    }
}