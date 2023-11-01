class Solution {
    public long solution(long n) {
        long answer = 0;
        int i = 1, num = -1;

        while ((long) i * i <= n){
            if (n == (long) i * i) {
                num = i;
                break;
            }
            i++;
        }

        return num != -1 ? (long) (num + 1) * (num + 1) : -1;
    }
}