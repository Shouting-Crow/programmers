class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        if ((-50_000 <= num1 && num1 <= 50_000) &&
            (-50_000 <= num2 && num2 <= 50_000))
        {
            answer = num1 - num2;
        }
        return answer;
    }
}