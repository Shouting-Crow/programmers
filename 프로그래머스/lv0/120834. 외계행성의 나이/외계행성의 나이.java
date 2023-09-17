class Solution {
    public String solution(int age) {
        String answer = "";
        char[] codes = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};

        for (int i = 3; i >= 0; i--) {
            if ((int)(age / Math.pow(10, i)) >= 1 || 
                (int)(age % Math.pow(10, i)) == 0){
                answer += codes[(int)(age / Math.pow(10, i))];
                age %= (int)Math.pow(10, i);
            }
        }
        return answer;
    }
}