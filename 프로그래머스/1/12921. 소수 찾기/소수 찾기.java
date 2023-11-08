class Solution {
    public int solution(int n) {
        int totalPrimeNum = 1;

        if (n == 2) return 1;

        for (int i = 3; i <= n; i += 2) {
            totalPrimeNum += primeNum(i);
        }

        return totalPrimeNum;

    }

    private static int primeNum(int n){
        int count = 0;

        for (int i = 1; i * i <= n; i++) {
            if (i * i == n) {
                count++;
                break;
            }
            else if (n % i == 0) count += 2;
            if (count > 2) return 0;
        }

        if (count == 2) return 1;

        return 0;
    }
}