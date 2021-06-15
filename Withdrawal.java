package Banking;
import java.util.*;
public class Withdrawal extends Transactions{
  void start(Customer c){
    Transactions W= new Withdrawal();
    System.out.println("Enter the amount to be withdrawn ");
    int amt=s.nextInt();
    s.nextLine();
    if (c.amount-amt>=0){
      c.amount=c.amount-amt;
      W.transid=c.transno++;
      W.amount=amt;
      W.balance=c.amount;
      W.type="ATM Withdrawal";
      c.history.add(W);
      System.out.println("Cash Withdrawn Successfully\n");
    }
    else System.out.println("Insufficient balance");
  }
}
