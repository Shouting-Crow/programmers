class Solution {
    public int solution(int num) {
        int answer = 0;

        if (num == 1) return answer;

        for (int i = 0; i < 500; i++) {
            if (num % 2 == 0) num /= 2;
            else if (num % 2 == 1) num = num * 3 + 1;

            if (num == 1) {
                answer = i+1;
                break;
            }
            else answer = -1;
        }

        return answer;

    }
}