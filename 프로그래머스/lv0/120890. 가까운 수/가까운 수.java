import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int index = 0;
        int[] gaps = new int[array.length];
        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            gaps[i] = Math.abs(n - array[i]);
        }

        int min = gaps[0];

        for (int i = 1; i < gaps.length; i++) {
            if (min > gaps[i]) {
                min = gaps[i];
                index = i;
            }
        }
        return array[index];
    }
}