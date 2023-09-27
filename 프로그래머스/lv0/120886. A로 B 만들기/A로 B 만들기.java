class Solution {
    public int solution(String before, String after) {
        int answer = 0;

        int[] alphabets = new int[26];

        for (int i = 0; i < before.length(); i++) {
            alphabets[(int)before.charAt(i) - 97]++;
        }

        for (int i = 0; i < after.length(); i++) {
            alphabets[(int)after.charAt(i) - 97]--;
        }

        for (int num : alphabets){
            if (num != 0) return 0;
            else answer = 1;
        }

        return answer;
    }
}