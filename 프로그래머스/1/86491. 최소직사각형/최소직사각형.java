class Solution {
    public int solution(int[][] sizes) {
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][1] >= sizes[i][0]){
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }

        int maxW = sizes[0][0], maxH = sizes[0][1];

        for (int i = 1; i < sizes.length; i++) {
            if (maxW <= sizes[i][0]) maxW = sizes[i][0];
            if (maxH <= sizes[i][1]) maxH = sizes[i][1];
        }

        return maxH * maxW;
    }
}