class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";

        char[] list1 = bin1.toCharArray();
        char[] list2 = bin2.toCharArray();

        int listTotal1 = 0;
        int listTotal2 = 0;

        for (int i = 0; i < list1.length; i++) {
            listTotal1 += Integer.parseInt(list1[i] + "") * Math.pow(2, list1.length - i - 1);
        }

        for (int i = 0; i < list2.length; i++) {
            listTotal2 += Integer.parseInt(list2[i] + "") * Math.pow(2, list2.length - i - 1);
        }

        int sumOfBinaryCode = listTotal1 + listTotal2;

        return Integer.toBinaryString(sumOfBinaryCode);
    }
}