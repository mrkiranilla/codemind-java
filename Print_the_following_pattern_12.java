import java.util.Scanner;
public class patt{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=1;
        for(int i=n;i>=1;i--){
            for(int j=c;j<=n;j++)
            {
                System.out.print(j+" ");
            }
            c+=1;
            System.out.printf("
");
        }

    }
}
