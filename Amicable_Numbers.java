import java.util.*;
public class amicable{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=0,s=0;
        for(int i=1;i<(a/2)+1;i++)
        {
            if(a%i==0)
            {
                sum+=i;
            }
        }
        for(int i=1;i<(b/2)+1;i++)
        {
            if(b%i==0)
            {
                s+=i;
            }
        }
        if(sum==b && s==a)
        {
           System.out.print("Amicable"); 
        }
        else
        {
           System.out.print("Not Amicable"); 
        }
    }
}