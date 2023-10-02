class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int diff = common[1] - common[0];

        if (diff == common[2] - common[1]){
            answer = common[common.length-1] + diff;
        }
        else {
            int divi = common[1] / common[0];
            answer = common[common.length-1] * divi;
        }
        return answer;
    }
}