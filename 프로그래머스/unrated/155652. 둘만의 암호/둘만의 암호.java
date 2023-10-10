import java.util.LinkedList;

class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        LinkedList<Character> list = new LinkedList<>();

        for (char c = 'a'; c <= 'z'; c++) {
            list.add(c);
        }

        for (char c : skip.toCharArray()) {
            list.remove(Character.valueOf(c));
        }

        for (char c : s.toCharArray()) {
            int currentIndex = list.indexOf(c);

            if (currentIndex == -1) {
                int newIndex = (index >= 0) ? index : list.size() + index;
                answer.append(list.get(newIndex));
            } else {
                int newIndex = (currentIndex + index) % list.size();
                if (newIndex < 0) {
                    newIndex += list.size();
                }
                answer.append(list.get(newIndex));
            }
        }

        return answer.toString();
    }
    //GPT 도움
}