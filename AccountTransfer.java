package Banking;
import java.util.*;
public class AccountTransfer extends Transactions{
  void start(Customer c){
    for (Map.Entry obj:Customer.customers.entrySet()){
      Customer a=(Customer)obj.getValue();
      Customer.cusacc.put(a.account_number, a);
    }
    Transactions A= new AccountTransfer();
    System.out.println("Enter the beneficiary account number");
    int acc= s.nextInt();
    s.nextLine();
    if (Customer.cusacc.containsKey(acc)){
      Customer receiver= Customer.cusacc.get(acc);
      System.out.println("Enter the amount ");
      int amt=s.nextInt();
      s.nextLine();
      if (c.amount-amt>=0){
        receiver.amount+=amt;
        c.amount-=amt;
        c.amount=c.amount-amt;
        A.transid=c.transno++;
        A.amount=amt;
        A.balance=c.amount;
        Integer a= acc;
        A.type="To account number: "+a.toString();
        c.history.add(A);
        A=new AccountTransfer();
        a=c.account_number;
        A.type="From account number: "+a.toString();
        Customer.cusacc.get(acc).history.add(A);
        System.out.println("Amount Transfered Successfully\n");
      }
      else System.out.println("Insufficient balance");
    }
    else System.out.println("Account number not found");
  }
}
