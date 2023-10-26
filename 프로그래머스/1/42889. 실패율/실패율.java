import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] failRatio = new double[N+2];
        int[][] stageAndUsers = new int[N+2][2];
        int totalUser = stages.length;
        Map<Integer, Double> map = new HashMap<>();
        int index = 0;

        for (int i = 0; i < stages.length; i++) {
            stageAndUsers[stages[i]][0] = stages[i];
            stageAndUsers[stages[i]][1] += 1;
        }

        for (int i = 0; i < stageAndUsers.length; i++) {
            if (stageAndUsers[i][1] == 0) {
                failRatio[i] = 0;
            }
            else {
                failRatio[i] = (double) stageAndUsers[i][1] / totalUser;
                totalUser -= stageAndUsers[i][1];
            }
        }

        for (int i = 1; i < failRatio.length - 1; i++) {
            map.put(i, failRatio[i]);
        }

        List<Integer> keys = new ArrayList<>(map.keySet());

        Collections.sort(keys, (v1, v2) -> (map.get(v2).compareTo(map.get(v1))));

        for (Integer key : keys){
            answer[index] = key;
            index++;
        }

        return answer;
    }
}