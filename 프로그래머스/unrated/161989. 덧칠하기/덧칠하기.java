class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int initRange = section[0] + m - 1;

        for (int i = 0; i < section.length; i++) {
            if (initRange < section[i]){
                initRange = m + section[i] - 1;
                answer++;
            }
        }

        return answer;
    }
}