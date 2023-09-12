class Solution {
    public int[] solution(int[] numbers) {
        
        int[] answers = new int[numbers.length];
        
        for(int i = 0; i < numbers.length; i++){
            answers[i] = numbers[i] * 2;
        }
        
        return answers;
    }
}