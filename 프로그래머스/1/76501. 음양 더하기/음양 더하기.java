class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int[] arr = new int[absolutes.length];
        int total = 0;

        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) arr[i] = absolutes[i];
            else arr[i] = absolutes[i] * -1;
            total += arr[i];
        }

        return total;
    }
}