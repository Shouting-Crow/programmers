class Solution {
    public int solution(int[] sides) {
        int max = sides[0];
        int index = 0;
        int totalTwoValues = 0;

        for (int i = 1; i < sides.length; i++) {
            if (max <= sides[i]) {
                max = sides[i];
                index = i;
            }
        }

        for (int i = 0; i < sides.length; i++) {
            if (i == index)  continue;
            totalTwoValues += sides[i];
        }

        if (sides[index] < totalTwoValues) return 1;
        else return 2;
    }
}