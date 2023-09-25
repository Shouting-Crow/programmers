import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;

        Arrays.sort(spell);
        for (String s : dic){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);

            if (arr.length != spell.length) continue;
            else if(String.join("", spell).equals(new String(arr))) answer = 1;
        }

        return answer;
    }
}