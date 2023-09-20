import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {
    public String solution(String my_string) {
        char[] chars = my_string.toCharArray();

        Stream<Character> characterStream = new String(chars).chars().mapToObj(i -> (char)i);

        return characterStream.distinct().map(String::valueOf).collect(Collectors.joining());
    }
}