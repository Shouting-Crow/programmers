class Solution {
    public int solution(String s) {
        int answer = 0;

        while (s.length() > 0) {
            char initChar = s.charAt(0);
            int initCharCount = 1;
            int otherCharCount = 0;
            int index = 1;

            while (index < s.length()) {
                if (initChar == s.charAt(index)) {
                    initCharCount++;
                } else {
                    otherCharCount++;
                }
                index++;

                if (initCharCount == otherCharCount) {
                    break;
                }
            }

            if (initCharCount == otherCharCount) {
                s = s.substring(index);
                answer++;
            } else {
                answer++;
                break;
            }
        }

        return answer;
    }
}