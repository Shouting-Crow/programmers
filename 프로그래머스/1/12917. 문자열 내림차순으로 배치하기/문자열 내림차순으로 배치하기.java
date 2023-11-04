class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] <= arr[j]){
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return String.valueOf(arr);
    }
}