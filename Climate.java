import java.util.Scanner;
public class profit{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>20)
        {
            System.out.print("HOT");
        }
        else
        {
            System.out.print("COLD");
        }
    }
}