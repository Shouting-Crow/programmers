class Solution {
    public int solution(int n) {
        int[] answer = new int[17];
        int startNum = 16, i = 0, result = 0, index = 0;

        while (n != 0){
            if (n - (int)Math.pow(3, startNum) >= 0){
                n -= (int)Math.pow(3, startNum);
                answer[i]++;
            }
            else {
                i++;
                startNum--;
            }
        }

        for (int j = 0; j < answer.length; j++) {
            if (answer[j] != 0) {
                index = j;
                break;
            }
        }

        for (int j = answer.length-1; j >= index; j--) {
            result += (int)Math.pow(3, j - index) * answer[j];
        }

        return result;
    }
}