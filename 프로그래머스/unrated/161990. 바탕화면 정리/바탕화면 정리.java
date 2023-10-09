class Solution {
    public int[] solution(String[] wallpaper) {
        int lux = 0, luy = 0, rdx = 0, rdy = 0, i = 0;
        int indexX = 0, indexY = 0;
        int max = 0, min = wallpaper[0].length();
        boolean flag = true;

        while(flag) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    lux = i;
                    indexX = i;
                    indexY = j;
                    flag = false;
                    break;
                }
            }
            i++;
        }

        for (int j = 0; j < wallpaper.length; j++) {
            for (int k = 0; k <= indexY; k++) {
                if (wallpaper[j].charAt(k) == '#' && min >= k){
                    min = k;
                    luy = min;
                    indexY = min;
                    break;
                }
            }
        }

        for (int j = wallpaper.length-1; j >= 0; j--) {
            if (wallpaper[j].contains("#")){
                rdx = j+1;
                break;
            }
        }

        for (int j = indexX; j < wallpaper.length; j++) {
            for (int k = wallpaper[j].length()-1; k >= indexY; k--) {
                if (wallpaper[j].charAt(k) == '#' && max <= k){
                    max = k;
                    rdy = max+1;
                }
            }
        }

        return new int[]{lux, luy, rdx, rdy};
    }
}