class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";

        for (String[] strings : db) {
            if (id_pw[0].equals(strings[0]) && id_pw[1].equals(strings[1])) return "login";
        }

        for (String[] strings : db) {
            if (id_pw[0].equals(strings[0])) return "wrong pw";
        }
        return answer;
    }
}