import java.util.Scanner;
public class Repeating
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String string=sc.nextLine();
		sc.close();
	    for(int i=0;i<string.length();i++){
	        int ct=0;
	        for(int j=0;j<string.length();j++){
	            if(string.charAt(i)==string.charAt(j)){
	                ct++;
	        }
	    }
	    if(ct==1){
		System.out.println(string.charAt(i));
		return;

	}
}
System.out.println("NonRepeating Character Not Found");
}
}