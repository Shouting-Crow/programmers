class Solution {
    public int solution(int chicken) {
        int remain = 0;
        int serviceChicken = 0;

        while(chicken != 0){
            serviceChicken += chicken / 10;
            remain += chicken % 10;
            chicken /= 10;
        }

        while (remain >= 10){
            serviceChicken += remain / 10;
            remain = remain % 10 + remain / 10;
        }

        return serviceChicken;
    }
}