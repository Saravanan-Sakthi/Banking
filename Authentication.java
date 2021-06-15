package Banking;
public class Authentication extends Input{
  void start(){
    System.out.println("Enter the Customer ID");
    int cid= s.nextInt();
    s.nextLine();
    if (Customer.customers.containsKey(cid)){
      if(Password.checkpass(Customer.customers.get(cid))){
        System.out.println("Successfully Authenticated");
        Transactions.type(Customer.customers.get(cid));
      }
      else System.out.println("Incorrect Password");
    }
    else System.out.println("Customer ID incorrect");
  }
}
