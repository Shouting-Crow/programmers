import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[][] targets) {
        int answer = 0;

        Arrays.sort(targets, (o1, o2) -> {return o1[1] - o2[1];});

        int last = -1;
        for (int[] target : targets) {
            if (last == -1){
                answer++;
                last = target[1] - 1;
                continue;
            }

            if (last >= target[0] && last <= target[1]) continue;

            answer++;
            last = target[1] - 1;
        }

        return answer;
    }
    //https://velog.io/@sheltonwon/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EC%9A%94%EA%B2%A9-%EC%8B%9C%EC%8A%A4%ED%85%9C-JAVA 참고
}