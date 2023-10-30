import java.util.ArrayList;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < nums.length-2; i++) {
            int total = 0;
            for (int j = i+1; j < nums.length-1; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    total = nums[i] + nums[j] + nums[k];
                    arrayList.add(total);
                    total = 0;
                }
            }
        }

        for (Integer i : arrayList){
            if (isPrimeNum(i)) answer++;
        }
        return answer;
    }

    private static boolean isPrimeNum(int num){
        int count = 0;

        for (int i = 1; i * i <= num; i++) {
            if (i * i == num) count++;
            else if (num % i == 0) count += 2;
        }

        if (count == 2) return true;
        else return false;
    }
}