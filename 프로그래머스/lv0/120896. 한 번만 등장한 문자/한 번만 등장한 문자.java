class Solution {
    public String solution(String s) {
        String answer = "";
        int[] count = new int[27];
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            count[Integer.parseInt(String.valueOf(arr[i] - 97))]++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] == 1){
                answer += Character.toString(i + 97);
            }
        }
        return answer;
    }
}