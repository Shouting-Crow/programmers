class Solution {
    public int[] solution(int n) {
        int[] answer;

        if (n % 2 != 1) {
            answer = new int[n/2];
            n -= 1;
        } else answer = new int[(n + 1) / 2];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = 1 + i * 2;
        }

        return answer;
    }
}