class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= 10; i++) {
            if (factorial(i) <= n){
                answer = i;
            }
        }

        return answer;
    }
    
    private static int factorial(int num){
        if (num == 1) return 1;
        return num * factorial(num-1);
    }
}