class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int count = 0;
        
        if ((0 < numer1 && numer1 < 1_000) &&
            (0 < numer2 && numer2 < 1_000) &&
            (0 < denom1 && denom1 < 1_000) &&
            (0 < denom2 && denom2 < 1_000))
        {
            answer[0] = numer1 * denom2 + numer2 * denom1;
            answer[1] = denom1 * denom2;
            
            int value = findValue(answer[0], answer[1]);
            
            answer[0] /= value;
            answer[1] /= value;
            
        }
        return answer;
    }
    
    private int findValue(int a, int b){
        if (b == 0) return a;
        return findValue(b, a % b);
    }
    
}