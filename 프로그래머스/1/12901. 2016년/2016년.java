class Solution {
    public String solution(int a, int b) {
        int sumOfDays = 0;

        String[] week = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int[] countOfDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (a > 1) {
            for (int i = 0; i < a-1; i++) {
                sumOfDays += countOfDays[i];
            }
        }
        sumOfDays += b;

        int dividedDays = sumOfDays % 7;

        return week[dividedDays];
    }
}