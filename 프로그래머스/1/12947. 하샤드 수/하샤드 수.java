class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int total = 0;
        String value = String.valueOf(x);

        for (int i = 0; i < value.length(); i++) {
            total += Integer.parseInt(value.charAt(i)+"");
        }

        if (x % total != 0) answer = false;

        return answer;
    }
}