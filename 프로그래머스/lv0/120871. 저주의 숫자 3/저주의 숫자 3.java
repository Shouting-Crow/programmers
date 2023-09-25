import java.util.Arrays;

class Solution {
    public int solution(int n) {
        int[] tempList = new int[200];

        for (int i = 0; i < tempList.length; i++) {
            tempList[i] = i+1;
        }

        for (int i = 0; i < tempList.length; i++) {
            if (tempList[i] % 3 == 0 || String.valueOf(tempList[i]).contains("3")){
                tempList[i] = 0;
            }
        }

        int[] list = Arrays.stream(tempList).filter(i -> i != 0).toArray();

        return list[n-1];
    }
}