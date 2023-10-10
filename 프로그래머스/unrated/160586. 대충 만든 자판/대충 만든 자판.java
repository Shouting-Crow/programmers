import java.util.HashMap;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        HashMap<Character, Integer> findMap = new HashMap<>();

        for (int i = 0; i < keymap.length; i++) {
            for (int j = 0; j < keymap[i].length(); j++) {
                if (findMap.containsKey(keymap[i].charAt(j)) && findMap.get(keymap[i].charAt(j)) <= j+1) continue;
                findMap.put(keymap[i].charAt(j), j+1);
            }
        }

        for (int i = 0; i < targets.length; i++) {
            for (int j = 0; j < targets[i].length(); j++) {
                if (findMap.containsKey(targets[i].charAt(j))) {
                    answer[i] += findMap.get(targets[i].charAt(j));
                } else {
                    answer[i] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}