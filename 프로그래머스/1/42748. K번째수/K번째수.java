import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int startIndex = commands[i][0]-1;
            int len = commands[i][1] - commands[i][0] + 1;

            int[] arr = Arrays.stream(array).skip(startIndex).limit(len).sorted().toArray();

            answer[i] = arr[commands[i][2]-1];

        }

        return answer;
    }
}