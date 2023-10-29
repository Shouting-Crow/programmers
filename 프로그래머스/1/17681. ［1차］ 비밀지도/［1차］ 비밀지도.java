import java.util.Arrays;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int[] resultMap = new int[n];

        for (int i = 0; i < n; i++) {
             resultMap[i] = arr1[i] | arr2[i];
        }

        for (int i = 0; i < resultMap.length; i++) {
            answer[i] = Integer.toBinaryString(resultMap[i]);

            while (answer[i].length() < n){
                String str = "0";
                answer[i] = str.concat(answer[i]);
            }

            answer[i] = answer[i].replaceAll("1", "#").replaceAll("0", " ");
        }

        return answer;
    }
}