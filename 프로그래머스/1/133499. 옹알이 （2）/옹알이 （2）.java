class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        for (int i = 0; i < babbling.length; i++) {
            if (!(babbling[i].contains("ayaaya") || babbling[i].contains("yeye")
                    || babbling[i].contains("woowoo") || babbling[i].contains("mama"))){
                babbling[i] = babbling[i].replaceAll("aya|ye|woo|ma", "");
            }
            if (babbling[i].equals("")) answer++;
        }
        return answer;
    }
}