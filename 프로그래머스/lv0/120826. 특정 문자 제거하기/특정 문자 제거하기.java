class Solution {
    public String solution(String my_string, String letter) {
        char[] newString =  my_string.toCharArray();

        for (int i = 0; i < newString.length; i++) {
            if (newString[i] == letter.charAt(0)){
                newString[i] = ' ';
            }
        }
        return new String(newString).replaceAll(" ", "");
    }
}