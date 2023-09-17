class Solution {
    public int solution(int n) {
        int total = 0;
        
        for(int i = 2; i <= n; i += 2){
            total += i;
        }
        return total;
    }
}