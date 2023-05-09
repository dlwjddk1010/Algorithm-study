import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String msg= "";
        int num = 0;
        for(int i = 0; i<a.length(); i++){
            num = (int)a.charAt(i);
            if(num >= 65 && num <= 90){
                msg += String.valueOf((char)(num+32));
            }else{
                msg += String.valueOf((char)(num-32));
            }
        }
        System.out.println(msg);
    }
}