package Banking;
import java.util.*;
public abstract class Transactions{
  int transid;
  int amount;
  int balance;
  String type;
  abstract void start(Customer c);
  static Scanner s= Input.s;
  static void type(Customer c){
    while(true){
      System.out.println("1. Cash Deposit");
      System.out.println("2. ATM Withdrawal");
      System.out.println("3. Account Transfer");
      System.out.println("4. Transaction History");
      System.out.println("5. Change Password");
      System.out.println("6. Top n");
      System.out.println("7. Exit");
      int n= s.nextInt();
      s.nextLine();
      if (n==1) new Deposit().start(c);
      else if (n==2) new Withdrawal().start(c);
      else if (n==3) new AccountTransfer().start(c);
      else if (n==4) seehistory(c);
      else if (n==5) Password.changepass(c);
      else if (n==6) Customer.topn();
      else if (n==7) break;
      else System.out.println("Invalid input");
    }
  }
  static void seehistory(Customer c){
    System.out.println("Trans ID         Trans type          Amount         Balance");
    for (Transactions obj:c.history){
      System.out.println(obj.transid+"       "+obj.type+"       "+obj.amount+"      "+obj.balance);
    }
  }
}
