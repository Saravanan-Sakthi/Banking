package Banking;
import java.util.*;
public class AddCustomer extends Input{
  void start(){
    for (Map.Entry obj:Customer.customers.entrySet()){
      Customer a=(Customer)obj.getValue();
      Customer.all.add(a);
    }
    Customer c= new Customer();
    System.out.println("Enter your name: ");
    c.name= s.nextLine();
    Password.createpassword(c);
    c.C_ID=Customer.cid++;
    c.account_number= Customer.accnum++;
    Customer.customers.put(c.C_ID,c);
    System.out.println("Account created successfully    your Customer ID: "+c.C_ID);
  }
}
