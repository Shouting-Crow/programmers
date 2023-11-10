import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] arrOfUniforms = new int[n];

        Arrays.fill(arrOfUniforms, 1);

        for (int i : lost) {
            arrOfUniforms[i - 1]--;
        }

        for (int i : reserve) {
            arrOfUniforms[i - 1]++;
        }

        for (int i = 0; i < arrOfUniforms.length; i++) {
            if (arrOfUniforms[i] == 0){
                if (i > 0 && arrOfUniforms[i-1] == 2){
                    arrOfUniforms[i-1]--;
                    arrOfUniforms[i]++;
                } else if (i < arrOfUniforms.length-1 && arrOfUniforms[i+1] == 2){
                    arrOfUniforms[i+1]--;
                    arrOfUniforms[i]++;
                }
            }
            if (arrOfUniforms[i] != 0) answer++;
        }

        return answer;
    }
}