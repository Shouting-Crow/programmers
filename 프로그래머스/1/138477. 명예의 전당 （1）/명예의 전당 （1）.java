import java.util.Arrays;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int min = score[0];
        answer[0] = min;
        
        if (k >= score.length){
            for (int i = 1; i < score.length; i++) {
                int[] arr = Arrays.stream(score).limit(i+1).sorted().toArray();
                answer[i] = arr[0];
            }
            return answer;
        }

        for (int i = 1; i < k; i++) {
            if (min >= score[i]) {
                min = score[i];
            }
            answer[i] = min;
        }

        for (int i = k; i < score.length; i++) {
            int[] arr = Arrays.stream(score).limit(i+1).sorted().toArray();
            answer[i] = arr[i-k+1];
        }

        return answer;
    }
}