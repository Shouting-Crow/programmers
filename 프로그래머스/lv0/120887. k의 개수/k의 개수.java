class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;

        for (int l = i; l <= j; l++) {
            String str = l + "";
            char[] arr = str.toCharArray();
            for (int m = 0; m < arr.length; m++) {
                if (arr[m] == (char)(k+'0')) answer++;
            }
        }
        return answer;
    }
}