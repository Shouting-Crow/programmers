import java.util.Arrays;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] arr1, arr2, arr3;
        arr1 = new int[lines[0][1] - lines[0][0]];
        arr2 = new int[lines[1][1] - lines[1][0]];
        arr3 = new int[lines[2][1] - lines[2][0]];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = lines[0][0] + i;
        }

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = lines[1][0] + i;
        }

        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = lines[2][0] + i;
        }

        int min = arr1[0];
        int max = arr1[0];

        if (min >= arr2[0] && arr3[0] >= arr2[0]) min = arr2[0];
        else if (min >= arr3[0]) min = arr3[0];

        if (max <= arr2[arr2.length-1] && arr2[arr2.length-1] >= arr3[arr3.length-1]) max = arr2[arr2.length-1];
        else if (max <= arr3[arr3.length-1]) max = arr3[arr3.length-1];

        int[] counts = new int[max - min + 1];

        calcCount(arr1, min, counts);
        calcCount(arr2, min, counts);
        calcCount(arr3, min, counts);

        System.out.println(Arrays.toString(counts));

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] >= 2) answer++;
        }

        return answer;
    }

    private static void calcCount(int[] arr1, int min, int[] counts) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < counts.length; j++) {
                if (arr1[i] == min + j) {
                    counts[j]++;
                    break;
                }
            }
        }
    }
}