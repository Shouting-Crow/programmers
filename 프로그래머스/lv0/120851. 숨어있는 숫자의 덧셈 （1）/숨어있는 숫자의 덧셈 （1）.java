class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String newString = "";

        newString = my_string.replaceAll("[a-zA-Z]", "");
        for (int i = 0; i < newString.length(); i++) {
            answer += Integer.parseInt(newString.charAt(i) + "");
        }
        return answer;
    }
}