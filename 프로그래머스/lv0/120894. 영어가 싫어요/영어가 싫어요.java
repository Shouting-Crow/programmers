class Solution {
    public long solution(String numbers) {
        String answerStr = "";
        int i = 0;

        while (numbers.length() > i){
            String checkStr = String.valueOf(numbers.charAt(i)) + String.valueOf(numbers.charAt(i+1));
            switch (checkStr){
                case "ze" :
                    answerStr += "0";
                    i += 4;
                    break;
                case "on" :
                    answerStr += "1";
                    i += 3;
                    break;
                case "tw" :
                    answerStr += "2";
                    i += 3;
                    break;
                case "th" :
                    answerStr += "3";
                    i += 5;
                    break;
                case "fo" :
                    answerStr += "4";
                    i += 4;
                    break;
                case "fi" :
                    answerStr += "5";
                    i += 4;
                    break;
                case "si" :
                    answerStr += "6";
                    i += 3;
                    break;
                case "se" :
                    answerStr += "7";
                    i += 5;
                    break;
                case "ei" :
                    answerStr += "8";
                    i += 5;
                    break;
                case "ni" :
                    answerStr += "9";
                    i += 4;
                    break;
                default:
                    i++;
                    break;
            }
        }
        return Long.parseLong(answerStr);
    }
}