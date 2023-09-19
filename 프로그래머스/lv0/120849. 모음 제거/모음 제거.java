class Solution {
    public String solution(String my_string) {
        char[] chars = new char[]{'a','e','i','o','u'};

        return replaceString(my_string, chars);
    }

    private static String replaceString(String my_string, char[] chars){
        for (int i = 0; i < chars.length; i++) {
            my_string = my_string.replaceAll(chars[i] + "", "");
        }
        return my_string;
    }
}