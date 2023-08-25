import java.util.*;
public class Bill{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String name=sc.nextLine();
        double unit=sc.nextInt();
        double cost,bill,tbill;
        
            if(unit<=199)
            {
                cost=1.20;
                bill=unit*cost;
            }
            else if(unit>=200 && unit<400)
            {
                cost=1.50;
                bill=unit*cost;
            }
            else if(unit>=400 && unit<600)
            {
                cost=1.80;
                bill=unit*cost;
            }
            else 
            {
                cost=2.00;
                bill=unit*cost;
            }
            
            if(bill>400)
            {
                tbill=bill+(bill*0.15);
            }
            else
            {
                tbill=bill+100;
            }
            System.out.printf("%.2f",tbill);
        
    }
}