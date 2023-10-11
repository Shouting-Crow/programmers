class Solution {
    public int solution(String t, String p) {
        int answer = 0;

        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            String newStr = "";
            for (int j = 0; j < p.length(); j++) {
                newStr += t.charAt(i+j);
            }
            if (Long.parseLong(newStr) <= Long.parseLong(p)) answer++;
        }
        return answer;
    }
}