class Solution {
    public int[] solution(int[][] score) {
        int total = 0;
        double[] average = new double[score.length];
        int[] num = new int[score.length];
        int[] count = new int[score.length];

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                total += score[i][j];
            }
            average[i] = (double) total / 2;
            total = 0;
        }

        for (int i = 0; i < average.length; i++) {
            for (int j = 0; j < average.length; j++) {
                if (average[i] > average[j]) count[i]++;
            }
        }

        for (int i = 0; i < count.length; i++) {
            count[i] = Math.abs(count[i] - count.length);
        }

        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count.length; j++) {
                if (count[i] == count[j]) {
                    num[i]++;
                }
            }
            num[i]--;
        }

        for (int i = 0; i < count.length; i++) {
            count[i] -= num[i];
        }
        return count;
    }
}