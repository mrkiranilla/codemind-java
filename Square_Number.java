import java.util.*;
public class num{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i*i+j*j==n)
                {
                   c=1;
                }
            }
        }
        if(c==1)
        {
             System.out.print("True");
        }
        else
        {
             System.out.print("False");
        }
    }
}