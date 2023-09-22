import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        char[] arr = new char[my_string.length()];
        arr = my_string.toLowerCase().toCharArray();

        Arrays.sort(arr);

        return String.valueOf(arr);
    }
}