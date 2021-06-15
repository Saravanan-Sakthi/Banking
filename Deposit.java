package Banking;
import java.util.*;
public class Deposit extends Transactions{
  void start(Customer c){
    Transactions D= new Deposit();
    System.out.println("Enter the amount to be deposited ");
    int amt=s.nextInt();
    s.nextLine();
    c.amount=c.amount+amt;
    D.transid=c.transno++;
    D.amount=amt;
    D.balance=c.amount;
    D.type="Cash Deposit";
    c.history.add(D);
    System.out.println("Cash Deposited Successfully\n");
  }
}
