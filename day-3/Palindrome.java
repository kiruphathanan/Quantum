import java.util.Scanner;
public class Palindrome {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int reve=0,temp=n;
        sc.close();
        while(n!=0) {
            reve=reve*10+n%10;
            n=n/10;
        }
        boolean isPalindrome=(temp==reve);
        System.out.print(isPalindrome);
    }
}