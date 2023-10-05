import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> playerInfo = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            playerInfo.put(players[i], i);
        }

        for (String name : callings){
            int index = playerInfo.get(name);
            if (index > 0) {
                String temp = players[index];
                players[index] = players[index - 1];
                players[index - 1] = temp;
                playerInfo.put(name, index - 1);
                playerInfo.put(players[index], index);
            }
        }

        return players;
    }
}