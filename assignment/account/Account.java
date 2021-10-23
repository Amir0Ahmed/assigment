
package account;

/*
 uml diagram for account class
-----------------------------------------------------------|    
      account                                              |
-----------------------------------------------------------|                                      
 -id:int                                                   | 
 -balnce:double                                            |
 -annualInterestRate:double                                |
 +date:Date                                                |
-----------------------------------------------------------|                                       
 +Account()                                                |
 + Account( id:int,  initialBal:double)                    |
 +getId():int                                              |
 + setId(id:int ):void                                     |
 +getBalance():double                                      |
 + setBalance( balance:double):void                        |
 + getAnnualInterestRate():double                          |
 + setAnnualInterestRate( annualInterestRate:double) :void |
 + getdatecreated():Date                                   |
 + getMonthlyInterestRate():double                         | 
 + withdraw( amt:double):void                              |
 + deposit( amt:double):void                               |
 + print():void                                            |
-----------------------------------------------------------|                                                           

*/
    import java.util.Date;

public class Account {
   private int id;
   private double balance;
   private static double annualInterestRate;

    public  Date date;

   public  Account() {
       this.id = 0;
       this.balance = 0;
       Account.annualInterestRate = 0;
       this.date = new Date();
   }

   public Account(int id, double initialBal) {
       this.id = id;
       this.balance = initialBal;
       Account.annualInterestRate = 0;
       this.date = new Date();
   }

   public int getId() {
       return id;
   }

   public void setId(int id) {
       this.id = id;
   }

   public double getBalance() {
       return balance;
   }
 

   public void setBalance(double balance) {
       this.balance = balance;
   }

   public static double getAnnualInterestRate() {
       return annualInterestRate;
   }

   public static void setAnnualInterestRate(double annualInterestRate) {
       Account.annualInterestRate = annualInterestRate;
   }
  public Date getdatecreated(){
       return date;
   }
   public double getMonthlyInterestRate() {
       return  ((annualInterestRate/12.0)/100);

   }
 public double getMonthlyInterest() {
       return (balance*getMonthlyInterestRate);

   }
   public void withdraw(double amt) {
       if (amt <= balance) {
           balance -= amt;
       } else {
           System.out.println("** Account balance is low **");
       }
   }

   public void deposit(double amt) {

       balance += amt;

   }

   
   public void print() {
   System.out.println("\nAccount ID:" + id);
   System.out.println("Balance:" + balance);
   System.out.println("Monthly Interest:" + getMonthlyInterest());
   System.out.println("Date Created:" + date);
  
      
   }
   public static void main(String[] args){

        Account acc=new Account(1122,20000);
Account.setAnnualInterestRate(4.5);
      acc.withdraw(2500);
      acc.deposit(3000);
      acc.print();
        
   }
}

    
    

