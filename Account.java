
package Banking;
import edu.emory.mathcs.backport.java.util.Arrays;
import java.io.*;
import java.util.*;
public class Account extends User implements Serializable{
    
    public boolean isAdminAccount = true;
    private Account userAccount, adminAccount;
    public int accNo=246;
    public double balance=10000, amount=0;
    ArrayList<Account> Accounts = new ArrayList<Account>(20);
    ArrayList<String> StringAccounts;
    //string array
    String [] stringAccounts;
    private static final long serialVersionUID = 6467292146538481328L;
  
    //creates admin user account
    public Account(){
        super();
        this.stringAccounts = new String[Accounts.size()];
        accNo = 246;
        balance = 10000;
        amount = 0;
    }
    //creates general user account
    public Account(String name, String gender, String email, String password,int accNo, double balance, double amount){
        super( name,  gender,  email,  password);
        this.stringAccounts = new String[Accounts.size()];
        this.balance = balance;
        this.amount = amount;
    }

    public int getAccNo(){
        accNo++;
        return accNo;
    }
        
    public String toString(Account acc){
        String str = String.valueOf(acc);
        System.out.println(str);
        return  str;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getAmount(){
        return amount;
    }
    public void setAmount(double amount){
        this.amount = amount;
    }
    
    public double withdrawMoney(double removeAmount,double removeBalance){

        removeBalance=  balance - removeAmount;
        System.out.println("Balance is: "+removeBalance);
        return removeBalance;
    }
    
    public double sendMoney(double removeAmount,double removeBalance){

        removeBalance=  balance - removeAmount;
        System.out.println("Balance is: "+removeBalance);
        return removeBalance;
    }
    
    public double depositMoney(double addAmount, double addBalance){
        addBalance = addAmount + balance; 
        System.out.println("Balance is: "+addBalance);
        return addBalance;
    }
    //creates general user account
    public Account createUserAccount(Account acc){
         
        String na = "", em="", ge="", pass="";
        int accno=0;
        double bal=10000, am=0;
        userAccount = new Account( na,  ge,  em,  pass,  accno,  bal,  am);
        return userAccount = acc;
    }
    
    //creates admin user account
    public Account createAdminAccount(Account acc){
        adminAccount = new Account();
        return acc = adminAccount;
    }
    //creates an Account array of then converts it into a string array
    public void storeAccount(){
        Account [] accounts = new Account[Accounts.size()];
        accounts [0] = account.createAdminAccount(this);// object array
        
        
        for(int i = 1; i <= accounts.length;i++){
            accounts[i]= account.createUserAccount(this);
        System.arraycopy(accounts, 0, stringAccounts, 0, accounts.length);
        
        }
        
        Accounts = new ArrayList<>(Arrays.asList(accounts));
        
        //change Object arraylist Accounts to String arraylist StringAccounts
        StringAccounts = (ArrayList<String>) Accounts.stream();
    }
    
    public void findItemInList(String em, String pa,Account acc){
            
            if(StringAccounts.contains(em)) {
               if(StringAccounts.contains(pa)){
                   System.out.println(acc.toString(acc));
               }
            }
    }
    
    boolean doneBanking, correctDetails;
    
    
    Scanner scan = new Scanner(System.in);
    Account account;
    
    public void prompt1(String input){
        doneBanking = false;
        System.out.println("");
        input = scan.nextLine();
    }
    
    
    public void processes(String input){
        if(input.toLowerCase().equals("exit")){
            System.out.println("Thank you for using Cloud Pesa!");
            doneBanking = true;
        }
        else if(input.toLowerCase().equals("home")){
            System.out.println();
            toString(account);
        }
        else if(input.toLowerCase().equals("withdraw")){
            System.out.println("How much would you like to withdraw?");
            double am = scan.nextDouble();
            account.withdrawMoney(am, balance);
        }
        else if(input.toLowerCase().equals("deposit")){
            System.out.println("How much would you like to deposit?");
            double de = scan.nextDouble();
            account.withdrawMoney(de, balance);
        }
        else if(input.toLowerCase().equals("create")){
            
            userAccount.createUserAccount(userAccount);
            userAccount.storeAccount();
            System.out.println("You're account has been created");
            userAccount.toString(userAccount);
            
            System.out.println("What action would you like to perform? withdraw or deposit?");
            switch (input.toLowerCase()) {
                case "withdraw":
                    System.out.println("How much would you like to withdraw?");
                    double am = scan.nextDouble();
                    account.withdrawMoney(am, balance);
                    break;
                case "deposit":
                    System.out.println("How much would you like to deposit?");
                    double de = scan.nextDouble();
                    account.withdrawMoney(de, balance);
                    break;
                default:
                    System.out.println("Incorrect input!");
                    break;
            }
        
            
        }
        else if(input.toLowerCase().equals("admin")){
            String em = adminAccount.getEmail();
            String pa = adminAccount.getPassword();
            adminAccount.findItemInList(em,pa, adminAccount);
            System.out.println("What action would you like to perform? withdraw or deposit");
            
            if(input.toLowerCase().equals("withdraw")){
            System.out.println("How much would you like to withdraw?");
            double am = scan.nextDouble();
            account.withdrawMoney(am, balance);
            }
            else if(input.toLowerCase().equals("deposit")){
            System.out.println("How much would you like to deposit?");
            double de = scan.nextDouble();
            account.withdrawMoney(de, balance);
            }
            else{
            System.out.println("Incorrect input!");
            }
        }
        
        
        else{
            System.out.println("Incorrect input!");
        }
        
        
        
    }
   
  }
