import java.util.*;
public class Large {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
       
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        Arrays.sort(arr);
         int lenth=arr.length;
        int large=arr[lenth-1];
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=large){
                System.out.print(arr[i]);
                break;
            }
    }
}
}
