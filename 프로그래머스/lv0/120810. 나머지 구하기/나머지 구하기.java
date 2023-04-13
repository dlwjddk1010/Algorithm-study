class Solution {
    public int solution(int num1, int num2) {
        int num = num1/num2;
        int answer = num1 - (num*num2);
        return answer;
    }
}