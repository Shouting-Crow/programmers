class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int index = 0;

        for (int i = 0; i < k - 1; i++) {
            index += 2;
            if (index > numbers.length - 1) index -= numbers.length;
        }
        answer = numbers[index];
        
        return answer;
    }
}