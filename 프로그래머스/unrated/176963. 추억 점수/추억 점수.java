import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        int totalScore = 0;

        Map<String, Integer> scoreMap = new HashMap<>();

        for (int i = 0; i < name.length; i++) {
            scoreMap.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            for (int j = 0; j < photo[i].length; j++) {
                if (scoreMap.containsKey(photo[i][j])) totalScore += scoreMap.get(photo[i][j]);
            }
            answer[i] = totalScore;
            totalScore = 0;
        }

        return answer;
    }
}