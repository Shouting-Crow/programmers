class Solution {
    public int solution(int[] numbers) {
        int total = 0;

        for (int number : numbers) {
            total += number;
        }

        return 45 - total;
    }
}