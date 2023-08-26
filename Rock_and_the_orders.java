import java.util.*;
public class food{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        int c=sc.nextInt();
        int a1=sc.nextInt();
        int a2=sc.nextInt();
        int a3=sc.nextInt();
        int b1=sc.nextInt();
        int b2=sc.nextInt();
        int b3=sc.nextInt();
        int A=(a1+a2+a3);
        int B=(b1+b2+b3);
        int total1=A+B+c;
        int total2=A+B+d+d;
        int total3=A+B+c+d;
        if(A>=150 && B>=150)
        {
            if(total1<total2)
            {
                System.out.print("YES");
            }
            else
            {
                System.out.print("NO");
            }
        }
        else if(A>=150 || B>=150)
        {
            
            if(total3<total2)
            {
                System.out.print("YES");
            }
            else
            {
                System.out.print("NO");
            }
            
        }
        else
        {
            System.out.print("NO");
        }
    }
}