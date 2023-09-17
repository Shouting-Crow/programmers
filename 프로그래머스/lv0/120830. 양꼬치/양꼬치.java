class Solution {
    public int solution(int n, int k) {
        int total = n * 12_000 + k * 2_000 - ((n / 10) * 2_000);
        
        return total;
    }
}