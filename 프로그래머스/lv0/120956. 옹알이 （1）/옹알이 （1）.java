class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};
        for(int i=0; i<babbling.length; i++){
            for(int j = 0; j<words.length; j++){
                babbling[i] = babbling[i].replace(words[j],"0");
            }
            babbling[i] = babbling[i].replaceAll("0", "");
            if(babbling[i].isEmpty()){
                  answer++;
            }
        }
        return answer;
    }
}