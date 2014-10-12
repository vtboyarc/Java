import java.util.Scanner;
 
class Input
{
   public static void main(String args[])
   {
      int a;
      float b;
      String s;
 
      Scanner in = new Scanner(System.in);
 
      System.out.println("Enter a string!");
      s = in.nextLine();
      
 
      System.out.println("Enter an integer!");
      a = in.nextInt();
     
 
      System.out.println("Enter a float(or don't, but I'll turn it into a float)!");
      b = in.nextFloat();
      System.out.println("You entered string "+s);
      System.out.println("You entered integer "+a);
      System.out.println("You entered float "+b);   
   }
}