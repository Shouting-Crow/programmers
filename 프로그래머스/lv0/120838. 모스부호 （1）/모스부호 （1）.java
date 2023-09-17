class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = new String[]{".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..",
                "--","-.","---",".--.","--.-",".-.",
                "...","-","..-","...-",".--","-..-",
                "-.--","--.."};

        String[] newLetter = letter.split(" ");

        for (int i = 0; i < newLetter.length; i++) {
            for (int j = 0; j < morse.length; j++) {
                if (newLetter[i].equals(morse[j])){
                    answer += (char)('a' + j);
                    break;
                }
            }
        }
        return answer;
    }
}