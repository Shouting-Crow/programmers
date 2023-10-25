class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();

        char[][] pad = {{'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'*', '0', '#'}};

        int[] leftPoint = {3, 0};
        int[] rightPoint = {3, 2};

        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (num == 1 || num == 4 || num == 7) {
                answer.append("L");
                leftPoint[0] = num == 1 ? 0 : (num == 4 ? 1 : 2);
                leftPoint[1] = 0;
            } else if (num == 3 || num == 6 || num == 9) {
                answer.append("R");
                rightPoint[0] = num == 3 ? 0 : (num == 6 ? 1 : 2);
                rightPoint[1] = 2;
            } else {
                int[] targetPoint = {(num == 2 ? 0 : (num == 5 ? 1 : (num == 8 ? 2 : 3))), 1};
                int leftDistance = Math.abs(leftPoint[0] - targetPoint[0]) + Math.abs(leftPoint[1] - targetPoint[1]);
                int rightDistance = Math.abs(rightPoint[0] - targetPoint[0]) + Math.abs(rightPoint[1] - targetPoint[1]);

                if (leftDistance < rightDistance || (leftDistance == rightDistance && hand.equals("left"))) {
                    answer.append("L");
                    leftPoint = targetPoint;
                } else {
                    answer.append("R");
                    rightPoint = targetPoint;
                }
            }
        }

        return answer.toString();
    }
}