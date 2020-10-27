
package Banking;
import java.util.*;

public class RunConsole extends Account{
    
    public static void main (String [] args){
       String resp1;
       Account account = new Account();
       Scanner scan = new Scanner(System.in);
                
       //new admin account
       System.out.println("Welcome to Cloud Pesa."+"\n"+" Enter create to create new user account"+"\n"+"admin to login as an Admin"+"\n"+"exit to exit the console.");
       resp1 = scan.nextLine();
       account.processes(resp1);
       
       
    }
}
