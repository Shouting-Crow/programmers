class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] initPoint = new int[2];

        for (int i = 0; i < park.length; i++) {
            if (park[i].contains("S")){
                for (int j = 0; j < park[i].length(); j++) {
                    if (park[i].charAt(j) == 'S') {
                        initPoint = new int[]{i, j};
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < routes.length; i++) {
            int move = Integer.parseInt(routes[i].split(" ")[1]);

            boolean flag = false;

            switch (routes[i].charAt(0)){
                case 'E' :
                    for (int j = 1; j <= move; j++) {
                        int nextCol = initPoint[1] + j;
                        if (nextCol >= park[0].length() || park[initPoint[0]].charAt(nextCol) == 'X') {
                            flag = true;
                            break;
                        }
                    }
                    if (!flag) {
                        initPoint[1] += move;
                    }
                    break;

                case 'N' :
                    for (int j = 1; j <= move; j++) {
                        int nextRow = initPoint[0] - j;
                        if (nextRow < 0 || park[nextRow].charAt(initPoint[1]) == 'X') {
                            flag = true;
                            break;
                        }
                    }
                    if (!flag) {
                        initPoint[0] -= move;
                    }
                    break;

                case 'S' :
                    for (int j = 1; j <= move; j++) {
                        int nextRow = initPoint[0] + j;
                        if (nextRow >= park.length || park[nextRow].charAt(initPoint[1]) == 'X') {
                            flag = true;
                            break;
                        }
                    }
                    if (!flag) {
                        initPoint[0] += move;
                    }
                    break;

                case 'W' :
                    for (int j = 1; j <= move; j++) {
                        int nextCol = initPoint[1] - j;
                        if (nextCol < 0 || park[initPoint[0]].charAt(nextCol) == 'X') {
                            flag = true;
                            break;
                        }
                    }
                    if (!flag) {
                        initPoint[1] -= move;
                    }
                    break;
            }
        }

        return initPoint;
    }
}