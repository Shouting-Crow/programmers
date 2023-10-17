class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        char[] xArr = X.toCharArray();
        char[] yArr = Y.toCharArray();
        int[] solArr = new int[10];

        int[] xCount = new int[10];
        int[] yCount = new int[10];

        for (int i = 0; i < xArr.length; i++) {
            xCount[Integer.parseInt(xArr[i] + "")]++;
        }

        for (int i = 0; i < yArr.length; i++) {
            yCount[Integer.parseInt(yArr[i] + "")]++;
        }

        for (int i = 0; i < 10; i++) {
            if (xCount[i] >= yCount[i] && xCount[i] != 0){
                solArr[i] += yCount[i];
            }
            else if (yCount[i] > xCount[i] && xCount[i] != 0) {
                solArr[i] += xCount[i];
            }
        }

        for (int i = solArr.length-1; i >= 0; i--) {
            answer += String.valueOf(i).repeat(solArr[i]);
        }

        if (answer.equals("")) answer = "-1";
        else if (answer.replaceAll("0", "").equals("")) answer = "0";

        return answer;
    }
}