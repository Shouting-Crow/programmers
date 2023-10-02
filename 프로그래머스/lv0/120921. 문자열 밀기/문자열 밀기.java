class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String newA = A;

        for (int i = 0; i < A.length(); i++) {
            if (newA.equals(B)){
                return answer;
            }
            String addtion = newA.substring(newA.length() - 1);
            newA = addtion + newA.substring(0, newA.length() - 1);
            answer++;
        }
        return -1;
        // https://king-ja.tistory.com/38 참고
    }
}