import java.util.*;
public class Missnum{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n-1;i++){
                arr[i]=sc.nextInt();
            }
            sc.close();
            int a=n*(n+1)/2;
            int sum=0;
            for(int i=0;i<arr.length-1;i++){
                sum=sum+arr[i];
            }
            int missing=a-sum;
            System.out.print(missing);
            
    }
}