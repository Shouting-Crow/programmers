class Solution {
    public int solution(String my_string) {
        String[] arr = my_string.split(" ");
        int total = Integer.parseInt(arr[0]);

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i].equals("+"))
                total += Integer.parseInt(arr[i+1]);
            else if(arr[i].equals("-"))
                total -= Integer.parseInt(arr[i+1]);
        }
        return total;
    }
}