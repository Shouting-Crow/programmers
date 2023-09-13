class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int temp = 0;
        
        if(array.length % 2 == 0) return answer;
        
        for(int i = 0; i < array.length - 1; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i] >= array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        answer = array[(int)(array.length - 1)/2];
        
        return answer;
    }
}