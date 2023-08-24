import java.util.Scanner;
public class disk{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextInt();
        double b=sc.nextInt();
        double ave=(a+b)/2;
        System.out.printf("%.4f",ave);
    }
}