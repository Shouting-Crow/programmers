class Solution {
    public String[] solution(String my_str, int n) {
        int length = my_str.length();
        String[] answer = new String[(int) Math.ceil((double) length / n)];
        int count = 0;
        int index = 0;

        while (true){
            if (length <= n) {
                answer[count] = my_str.substring(index, my_str.length());
                break;
            }
            answer[count++] = my_str.substring(index, index + n);
            length -= n;
            index += n;
        }
        return answer;
    }
}