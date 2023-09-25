class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[][] safeBoard = new int[board.length][board.length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1){
                    for (int k = -1; k <= 1; k++) {
                        for (int l = -1; l <= 1; l++) {
                            if (0 <= i+k && i+k < board.length && 0 <= j+l && j+l < board.length){
                                safeBoard[i+k][j+l] = 1;
                            }
                        }
                    }
                }
            }
        }

        for (int i = 0; i < safeBoard.length; i++) {
            for (int j = 0; j < safeBoard.length; j++) {
                if (safeBoard[i][j] == 0) answer++;
            }
        }
        return answer;
    }
}