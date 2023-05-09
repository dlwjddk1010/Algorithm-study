import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String msg =" is even";
        if(n %2 == 1){
            msg = " is odd";
        }
        System.out.println(n + msg);
    }
}