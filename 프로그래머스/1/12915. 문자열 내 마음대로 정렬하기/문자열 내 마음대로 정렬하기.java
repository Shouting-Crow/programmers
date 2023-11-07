import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        String[] pair = new String[strings.length];

        for (int i = 0; i < strings.length; i++) {
            pair[i] = strings[i].charAt(n) + " " + strings[i];
        }

        Arrays.sort(pair);

        for (int i = 0; i < pair.length; i++) {
            answer[i] = pair[i].substring(2);
        }

        return answer;
    }
}