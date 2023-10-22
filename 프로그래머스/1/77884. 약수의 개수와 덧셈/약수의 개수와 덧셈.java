class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            if (divisor(i) % 2 == 0) answer += i;
            else answer -= i;
        }

        return answer;
    }

    private static int divisor(int value){
        int count = 0;
        for (int i = 1; i*i <= value; i++) {
            if (i*i == value) count++;
            else if (value % i == 0) count += 2;
        }

        return count;
    }
}