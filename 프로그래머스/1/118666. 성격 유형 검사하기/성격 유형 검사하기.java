import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int RT = 0, CF = 0, JM = 0, AN = 0;

        List<Map<Character, Integer>> mapList = new ArrayList<>();

        for (int i = 0; i < survey.length; i++) {
            Map<Character, Integer> map = new HashMap<>();
            if (choices[i] >= 4){
                map.put(survey[i].charAt(1), Math.abs(choices[i] - 4));
            }
            else {
                map.put(survey[i].charAt(0), Math.abs(choices[i] - 4));
            }
            mapList.add(map);
        }

        for (int i = 0; i < mapList.size(); i++) {
            if (mapList.get(i).containsKey('R')) RT += mapList.get(i).get('R');
            else if (mapList.get(i).containsKey('T')) RT -= mapList.get(i).get('T');
            else if (mapList.get(i).containsKey('C')) CF += mapList.get(i).get('C');
            else if (mapList.get(i).containsKey('F')) CF -= mapList.get(i).get('F');
            else if (mapList.get(i).containsKey('J')) JM += mapList.get(i).get('J');
            else if (mapList.get(i).containsKey('M')) JM -= mapList.get(i).get('M');
            else if (mapList.get(i).containsKey('A')) AN += mapList.get(i).get('A');
            else if (mapList.get(i).containsKey('N')) AN -= mapList.get(i).get('N');
        }
        
        if (RT >= 0) answer += "R";
        else answer += "T";

        if (CF >= 0) answer += "C";
        else answer += "F";

        if (JM >= 0) answer += "J";
        else answer += "M";

        if (AN >= 0) answer += "A";
        else answer += "N";

        return answer;
    }
}