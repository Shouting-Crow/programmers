class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        int[] primeNums = new int[number];

        for (int i = 0; i < primeNums.length; i++) {
            primeNums[i] = primeNumber(i+1);
        }

        for (int n : primeNums){
            if (n <= limit) answer += n;
            else answer += power;
        }

        return answer;
    }

    private static int primeNumber(int num){
        int count = 0;
        for (int i = 1; i * i <= num ; i++) {
            if (i * i == num) count++;
            else if (num % i == 0) count += 2;
        }
        return count;
    }
}