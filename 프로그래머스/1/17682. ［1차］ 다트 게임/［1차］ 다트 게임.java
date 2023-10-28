import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int tempValue = 0;

        Pattern pattern = Pattern.compile("([0-9]+)|([A-Za-z]+)|([^0-9A-Za-z]+)");
        Matcher matcher = pattern.matcher(dartResult);
        ArrayList<String> arrayList = new ArrayList<>();

        while (matcher.find()){
            String token = matcher.group();
            arrayList.add(token);
        }

        while (arrayList.size() > 0){
            if (arrayList.size() >= 3 && arrayList.get(2).equals("#")){
                answer += (symbolExponential(arrayList.get(1), Integer.parseInt(arrayList.get(0))) * -1);
                tempValue = (symbolExponential(arrayList.get(1), Integer.parseInt(arrayList.get(0))) * -1);
                arrayList.remove(0);
                arrayList.remove(0);
                arrayList.remove(0);
            }
            else if (arrayList.size() >= 3 && arrayList.get(2).equals("*")){
                answer += (symbolExponential(arrayList.get(1), Integer.parseInt(arrayList.get(0))) * 2);
                tempValue = (symbolExponential(arrayList.get(1), Integer.parseInt(arrayList.get(0))) * 2);
                arrayList.remove(0);
                arrayList.remove(0);
                arrayList.remove(0);
            }
            else {
                answer += symbolExponential(arrayList.get(1), Integer.parseInt(arrayList.get(0)));
                tempValue = symbolExponential(arrayList.get(1), Integer.parseInt(arrayList.get(0)));
                arrayList.remove(0);
                arrayList.remove(0);
            }

            if (arrayList.size() >= 3 && arrayList.get(2).equals("*")){
                answer -= tempValue;
                answer += tempValue * 2;
            }
        }

        return answer;
    }

    private static int symbolExponential(String symbol, int value){
        if (symbol.equals("D")) value = (int)Math.pow(value, 2);
        else if (symbol.equals("T")) value = (int)Math.pow(value, 3);
        else return value;

        return value;
    }
}