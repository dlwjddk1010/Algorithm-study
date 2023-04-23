import java.util.*;

class Solution {
    public String solution(String s) {
        String[] answer = s.split(" ");
        int[] numbers = new int[answer.length];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(answer[i]);
        }
        Arrays.sort(numbers);
        int min = numbers[0];
        int max = numbers[answer.length-1];
        return min + " " + max;
    }
}