import java.util.*;
public class vowel{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char x=sc.nextLine().charAt(0);
        if(x=='a' || x=='A' ||x=='e' ||x=='E' || x=='I' || x=='i' ||x=='O' ||x=='o' || x=='U' || x=='u')
        {
            System.out.print("Vowel");
        }
        else
        {
            System.out.print("Consonant");
        }
    }
}