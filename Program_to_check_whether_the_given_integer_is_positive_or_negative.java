import java.util.Scanner;
public class num{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=0)
        {
            System.out.print("Positive Number");
        }
        else
        {
            System.out.print("Negative Number");
        }
    }
}