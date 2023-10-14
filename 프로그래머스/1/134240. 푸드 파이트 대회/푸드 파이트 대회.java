class Solution {
    public String solution(int[] food) {
        String answer = "";

        for (int i = 1; i < food.length; i++) {
            if (food[i] % 2 != 0) food[i] -= 1;
        }

        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i]/2; j++) {
                answer += String.valueOf(i);
            }
        }

        String reversStr = answer;
        StringBuffer sb = new StringBuffer(reversStr);
        reversStr = sb.reverse().toString();

        answer += "0" + reversStr;

        return answer;
    }
}