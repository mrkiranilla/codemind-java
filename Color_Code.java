import java.util.*;
public class colour{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char x=sc.nextLine().charAt(0);
        if(x=='V' || x=='v')
        {
            System.out.print("Violet");
        }
        else if(x=='I' || x=='i')
        {
            System.out.print("Indigo");
        }
        else if(x=='B' || x=='b')
        {
            System.out.print("Blue");
        }
        else if(x=='G' || x=='g')
        {
            System.out.print("Green");
        }
        else if(x=='Y' || x=='y')
        {
            System.out.print("Yellow");
        }
        else if(x=='O' || x=='o')
        {
            System.out.print("Orange");
        }
        else if(x=='R' || x=='r')
        {
            System.out.print("Red");
        }
        else
        {
            System.out.print(-1);
        }
    }
}