class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int a = 0;
        int b = 0;

        for (String s : keyinput) {
            if (s.equals("left") && a > (board[0] - 1) / 2 * -1) a -= 1;
            else if (s.equals("right") && a < (board[0] - 1) / 2) a += 1;
            else if (s.equals("up") && b < (board[1] - 1) / 2) b += 1;
            else if (s.equals("down") && b > (board[1] - 1) / 2 * -1) b -= 1;
        }
        return new int[]{a, b};
    }
}