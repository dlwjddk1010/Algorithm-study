class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n%2==0?n/2:n/2+1];
        int num = 0;
        for(int i = 1; i<=n; i+=2){
            answer[num]=i;
            num++;
        }
        return answer;
    }
}