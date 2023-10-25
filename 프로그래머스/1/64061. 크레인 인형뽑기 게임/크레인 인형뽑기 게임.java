import java.util.Objects;
import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int index = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][moves[i]-1] != 0){
                    stack.push(board[j][moves[i]-1]);
                    board[j][moves[i]-1] = 0;
                    index++;
                    break;
                }
            }
            if (stack.size() >= 2 && Objects.equals(stack.peek(), stack.get(index - 2))){
                stack.pop();
                index -= 1;
                stack.pop();
                index -= 1;
                answer += 2;
            }
        }

        return answer;
    }
}