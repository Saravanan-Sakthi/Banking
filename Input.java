package Banking;
import java.util.Scanner;
public class Input{
  static Scanner s= new Scanner(System.in);
  static void getinput(){
    while(true){
      System.out.println("1. New Customer");
      System.out.println("2. Existing Customer");
      System.out.println("3. Exit");
      System.out.println("Enter the option");
      int n= s.nextInt();
      s.nextLine();
      if (n==1) new AddCustomer().start();
      else if (n==2) new Authentication().start();
      else if (n==3) {
        System.out.println("Thank you");
        break;
      }
      else System.out.println("Invalid input");
    }
  }
}
