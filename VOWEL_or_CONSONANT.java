import java.util.Scanner;
public class vowel{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        char a=sc.next().charAt(0);
        if(a=='a' || a=='A' || a=='e' || a=='E' || a=='i' || a=='I' ||a=='o' || a=='O' ||a=='u' || a=='U')
        {
            System.out.print("VOWEL");
        }
        else
        {
            System.out.print("CONSONANT");
        }
    }
}