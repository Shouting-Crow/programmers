class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int yCount = 0, pCount = 0;

        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'y') yCount++;
            else if (s.charAt(i) == 'p') pCount++;
        }

        answer = yCount == pCount;

        return answer;
    }
}