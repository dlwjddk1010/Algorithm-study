class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        String[] word1 = str1.split("");
        String[] word2 = str2.split("");
        for(int i = 0; i<word1.length; i++){
            answer += word1[i] + word2[i];
        }
        return answer;
    }
}