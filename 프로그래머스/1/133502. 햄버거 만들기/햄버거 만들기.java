import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        List<Integer> remainingIngredients = new ArrayList<>();

        for (int i : ingredient) {
            remainingIngredients.add(i);
            int lastIndex = remainingIngredients.size() - 1;

            while (remainingIngredients.size() >= 4 &&
                    remainingIngredients.get(lastIndex - 3) == 1 &&
                    remainingIngredients.get(lastIndex - 2) == 2 &&
                    remainingIngredients.get(lastIndex - 1) == 3 &&
                    remainingIngredients.get(lastIndex) == 1) {
                answer++;
                remainingIngredients.remove(lastIndex);  
                remainingIngredients.remove(lastIndex - 1);  
                remainingIngredients.remove(lastIndex - 2);  
                remainingIngredients.remove(lastIndex - 3); 
                lastIndex = remainingIngredients.size() - 1;
            }
        }

        return answer;
}
}