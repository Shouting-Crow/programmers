class Solution {
    public String solution(String polynomial) {
        int totalValue = 0;
        int totalX = 0;
        String answer = "0";

        String[] arr = polynomial.split(" ");

        for (String str : arr){
            str = str.trim();
            if (str.charAt(str.length()-1) == 'x') {
                str = str.replaceAll("[^0-9]", "");
                if (str.equals("")) {
                    totalX += 1;
                    continue;
                }
                totalX += Integer.parseInt(str);
            }
            else if (!str.equals("+")) totalValue += Integer.parseInt(str);
        }

        if (totalX == 0 && totalValue == 0) return answer;
        else if (totalX == 0) answer = totalValue + "";
        else if (totalValue == 0 && totalX > 1) answer = totalX + "x";
        else if (totalValue == 0 && totalX == 1) answer = "x";
        else if (totalX == 1) answer = "x + " + totalValue;
        else answer = totalX + "x + " + totalValue;

        return answer;
    }
}