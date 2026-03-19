import java.util.*;
public class Sliding
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    HashSet<Character>s=new HashSet<>();
	    int le=0;
	    int len=0;
		sc.close();
	    for(int right=0;right<str.length();right++){
	        while(s.contains(str.charAt(right))){
	            s.remove(str.charAt(le));
	            le++;
	        
	    }
	    s.add(str.charAt(right));
	    len=Math.max(len,right-le+1);
	}
		System.out.println(len);
	}
}