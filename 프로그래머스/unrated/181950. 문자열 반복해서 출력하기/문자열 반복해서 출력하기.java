import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String msg = "";
        int n = sc.nextInt();
        for(int i =0; i<n; i++){
            msg += str;
        }
        System.out.println(msg);
    }
}