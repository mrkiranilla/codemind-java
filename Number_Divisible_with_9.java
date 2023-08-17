import java.util.Scanner;
public class profit{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%9==0)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}