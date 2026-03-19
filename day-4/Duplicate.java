import java.util.*;
public class Duplicate{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        HashSet<Integer>set=new HashSet<>();
        HashSet<Integer>duplicate=new HashSet<>();
        for(int num:arr){
            if(set.contains(num)){
                duplicate.add(num);
            }
            else{
                set.add(num);
            }

        }
        System.out.println(duplicate);

    }}