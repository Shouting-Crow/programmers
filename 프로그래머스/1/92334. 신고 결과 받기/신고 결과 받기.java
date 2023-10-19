import java.util.*;


class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Set<String> reportSet = new HashSet<>(Arrays.asList(report));
        String[] newReport = reportSet.toArray(new String[0]);

        int[] answer = new int[id_list.length];
        List<String> reportNames = new ArrayList<>();
        List<String> reportedNames = new ArrayList<>();
        int[] reportedPoint = new int[id_list.length];
        List<String> bannedList = new ArrayList<>();

        for (int i = 0; i < newReport.length; i++) {
            reportNames.add(newReport[i].split(" ")[0]);
            reportedNames.add(newReport[i].split(" ")[1]);
        }

        for (int i = 0; i < id_list.length; i++) {
            for (int j = 0; j < reportedNames.size(); j++) {
                if (reportedNames.get(j).equals(id_list[i])){
                    reportedPoint[i]++;
                }
            }
        }

        for (int i = 0; i < reportedPoint.length; i++) {
            if (reportedPoint[i] >= k){
                bannedList.add(id_list[i]);
            }
        }

        for (int i = 0; i < bannedList.size(); i++) {
            for (int j = 0; j < reportedNames.size(); j++) {
                if (bannedList.get(i).equals(reportedNames.get(j))){
                    answer[Arrays.asList(id_list).indexOf(reportNames.get(j))]++;
                }
            }
        }

        return answer;
    }
}