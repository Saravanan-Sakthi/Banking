package Banking;
import java.util.Scanner;
public class Password{
  static Scanner s= Input.s;
  static void createpassword(Customer c){
    System.out.println("Create a Password\n");
    System.out.println("Password should contain 2 lower case, 2 upper case and 2 numbers with a minimum length of  6");
    String pass=s.nextLine();
    if(passconstraints(pass)) {
      System.out.println("Re enter password");
      String repass= s.nextLine();
      if (repass.equals(pass)) {
        c.pass= encrypt(pass);
        passhistory(c);
      }
      else {
        System.out.println("Please  recreate password "+pass);
        createpassword(c);
      }
    }
    else {
      System.out.println("Password do not match the constraints");
      createpassword(c);
    }
  }
  static boolean passconstraints(String pass){
    boolean res=false;
    if (pass.length()>=6){
      int l=0,c=0,n=0;
      for (int i=0;i<pass.length();i++){
        int a=(int)pass.charAt(i);
        if(a>=48 && a<=57) n++;
        if (a>=65 && a<=90) c++;
        if (a>=97 && a<=122) l++;
      }
      if (l>=2 && c>=2 && n>=2) res= true;
    }
    else res= false;
    return res;
  }
  static boolean checkpass(Customer c){
    System.out.println("Enter the password");
    String pass= encrypt(s.nextLine());
    if(pass.equals(c.pass)) return true;
    else return false;
  }
  static void passhistory(Customer c){
    c.passwords[0]=c.passwords[1];
    c.passwords[1]=c.passwords[1];
    c.passwords[2]=c.pass;
  }
  static String encrypt(String pass){
    String res="";
    for (int i=0;i<pass.length();i++){
      res=res+(char)((int)pass.charAt(i)+1);
    }
    return res;
  }
  static void changepass(Customer c){
    System.out.println("Enter Current Password");
    String cp= s.nextLine();
    if (checkpass(c)) createpassword(c);
  }
}
