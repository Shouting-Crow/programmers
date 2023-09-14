class Solution {
    public int solution(int slice, int n) {
        int pizza = 1;
        boolean flag = false;
        
        if(n % (slice * pizza) == 0) flag = true;
        
        while((int)(n / (slice * pizza)) >= 1){
            pizza++;
        }
        
        if(flag) pizza--;
        
        return pizza;
    }
}