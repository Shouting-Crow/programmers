import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] tempEmergency = new int[emergency.length];

        System.arraycopy(emergency, 0, tempEmergency, 0, emergency.length);

        Arrays.sort(tempEmergency);

        for (int i = 0; i < tempEmergency.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                if (tempEmergency[i] == emergency[j]){
                    answer[j] = emergency.length - i;
                    break;
                }
            }
        }
        return answer;
    }
}