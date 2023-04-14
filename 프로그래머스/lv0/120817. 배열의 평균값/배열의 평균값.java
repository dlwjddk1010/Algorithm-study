class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        for(Integer v : numbers){
            answer += v;
        }
        answer = answer / numbers.length;
        return answer;
    }
}