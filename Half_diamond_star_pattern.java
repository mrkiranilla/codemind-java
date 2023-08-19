import java.util.Scanner;
public class patt{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=3 && n<=100)
        {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.printf("
");
        }
        for(int i=n-1;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print("*");
            }
            System.out.printf("
");
        }
        }
        else
        {
            System.out.print("The pattern is not possible");
        }

    }
}
