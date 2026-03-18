import java.util.Scanner;
public class Reverse {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String reverse="";
        sc.close();
        for(int i=s.length()-1;i>=0;i--) {
            reverse=reverse+s.charAt(i);
        }
        System.out.print(reverse);
    }
}