import java.util.Scanner;
public class lamps{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int b=n-k;
        int pr=k*x;
        int pr2=b*y;
        if(x<y)
        {
            System.out.print(n*x);
        }
        else
        {
            System.out.print(pr+pr2);
        }
    }
}