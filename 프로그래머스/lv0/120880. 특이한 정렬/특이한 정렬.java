import java.util.Arrays;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int[] gapList = new int[numlist.length];
        int[] minusList = new int[numlist.length];

        for (int i = 0; i < gapList.length; i++) {
            if (numlist[i] - n < 0) minusList[i] = (numlist[i] - n) * -1;
            gapList[i] = Math.abs(numlist[i] - n);
        }

        Arrays.sort(gapList);

        for (int i = 0; i < gapList.length-1; i++) {
            if (gapList[i] == gapList[i+1]) gapList[i+1] *= -1;
        }

        for (int i = 0; i < minusList.length; i++) {
            for (int j = 0; j < gapList.length; j++) {
                if (minusList[i] == gapList[j] && (j == minusList.length-1 || gapList[j+1] != minusList[i] * -1)){
                    gapList[j] *= -1;
                    break;
                }
            }
        }

        for (int i = 0; i < gapList.length; i++) {
            answer[i] = n + gapList[i];
        }

        return answer;
    }
}