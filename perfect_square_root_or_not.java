import java.util.*;
public class square{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n/2;i++)
        {
            if(i*i==n)
            {
                System.out.print("True");
                return;
            }
        }
        System.out.print("False");
    }
}