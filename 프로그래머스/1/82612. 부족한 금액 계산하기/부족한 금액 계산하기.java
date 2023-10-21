class Solution {
    public long solution(int price, int money, int count) {
        long total = 0;

        for (int i = 1; i <= count; i++) {
            total += (long) i * price;
        }

        long result = money - total;

        if (result >= 0) return 0;

        return Math.abs(result);
    }
}