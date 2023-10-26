import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        int[] scores = new int[3];

        int[] onePattern = {1,2,3,4,5};
        int[] twoPattern = {2,1,2,3,2,4,2,5};
        int[] threePattern = {3,3,1,1,2,2,4,4,5,5};

        ArrayList<Integer> one = new ArrayList<>();
        ArrayList<Integer> two = new ArrayList<>();
        ArrayList<Integer> three = new ArrayList<>();

        while (one.size() < answers.length){
            for (int i : onePattern) {
                one.add(i);
            }
        }

        while (two.size() < answers.length){
            for (int i : twoPattern) {
                two.add(i);
            }
        }

        while (three.size() < answers.length){
            for (int i : threePattern) {
                three.add(i);
            }
        }

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == one.get(i)) scores[0]++;
            if (answers[i] == two.get(i)) scores[1]++;
            if (answers[i] == three.get(i)) scores[2]++;
        }

        int maxValue = Math.max(scores[0], Math.max(scores[1], scores[2]));

        List<Integer> maxScores = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxValue){
                maxScores.add(i+1);
            }
        }

        return maxScores.stream().mapToInt(i -> i).toArray();
    }
}