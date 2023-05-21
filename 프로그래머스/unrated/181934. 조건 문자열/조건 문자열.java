class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        int a = ineq.equals("<")?1:0;
        if(eq.equals("!")){
            if(a==1){
                answer = n<m?1:0;
            }else{
                answer = n>m?1:0;
            }
        }else{
           if(a==1){
                answer = n<=m?1:0;
            }else{
                answer = n>=m?1:0;
            }
        }
        
        return answer;
    }
}