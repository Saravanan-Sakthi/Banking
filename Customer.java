package Banking;
import java.util.*;
public class Customer{  // POJO class
  static Scanner s=new Scanner(System.in);
  static HashMap <Integer, Customer> customers= new HashMap<>();// Customer objects are added with key as their customer id when a new customer is created
  static HashMap <Integer, Customer> cusacc= new HashMap<>();//Customer objecs from the above HashMap is added with key as their account number for transaction
  static ArrayList <Customer> all= new ArrayList<>();
  static int cid=1;
  static int accnum=1;
  String name;
  String pass;
  int amount=10000;
  int C_ID;
  int account_number;
  int transno=1;
  String [] passwords= new String[] {"","",""};
  ArrayList <Transactions> history= new ArrayList<>();
  static void topn(){
    System.out.println("Enter n ");
    int n= s.nextInt();
    s.nextLine();
    for (int i=0;i<n;i++){
      Customer max=all.get(i);
      Customer a= all.get(i);
      for (int j=0;j<all.size();j++){
        Customer b= all.get(j);
        if (b.amount>max.amount) max=b;
      }
      System.out.println(max.name);
    }
  }
}
