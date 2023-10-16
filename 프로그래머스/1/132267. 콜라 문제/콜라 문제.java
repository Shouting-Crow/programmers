class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int changedBottle = 0;
        int remainingBottle = 0;

        while (n >= a){
            changedBottle = (n / a) * b;
            remainingBottle = n % a;
            answer += changedBottle;

            n = changedBottle + remainingBottle;
        }

        return answer;
    }
}