class Solution {
    public double solution(int[] numbers) {
        int total = 0;
        double average = 0.0;
        
        for(int num : numbers){
            total += num;
        }
        
        average = (double)total / numbers.length;
        
        return average;
    }
}