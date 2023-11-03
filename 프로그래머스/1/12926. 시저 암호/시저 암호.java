class Solution {
    public String solution(String s, int n) {
        char[] chars = s.toCharArray();
        char[] newchars = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') newchars[i] = ' ';
            else if (chars[i] + n > 'Z' && chars[i] <= 'Z') {
                newchars[i] = (char) (chars[i] - 'Z' + 'A' + n - 1);
            }
            else if (chars[i] + n > 'z' && 'Z' < chars[i] && chars[i] <= 'z'){
                newchars[i] = (char) (chars[i] - 'z' + 'a' + n - 1);
            }
            else newchars[i] = (char) (chars[i] + n);
        }

        return String.valueOf(newchars);
    }
}