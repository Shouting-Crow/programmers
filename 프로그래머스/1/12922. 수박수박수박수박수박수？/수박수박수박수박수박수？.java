class Solution {
    public String solution(int n) {
        String answer = "수박";

        answer = answer.repeat((n + 1) / 2);
        if (n % 2 == 1) answer = answer.substring(0, answer.length()-1);

        return answer;
    }
}