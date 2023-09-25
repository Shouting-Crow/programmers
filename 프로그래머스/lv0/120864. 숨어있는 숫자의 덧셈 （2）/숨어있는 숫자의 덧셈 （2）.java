class Solution {
    public int solution(String my_string) {
        int total = 0;
        String numStr = "";

        char[] arr = my_string.toCharArray();

        for (char c : arr) {
            if (Character.isDigit(c)) {
                numStr += c;
            } else {
                if (!numStr.isEmpty()) {
                    total += Integer.parseInt(numStr);
                    numStr = "";
                }
            }
        }
        
        if (!numStr.isEmpty()){
            total += Integer.parseInt(numStr);
        }
        
        return total;
    }
}