public class TryCatch
{ public static void main(String args[])
 { int a,b,c;
 try
 {
 a = 0;
 b = 10;
 c = b/a;
 System.out.println("This line will not be executed");
 }
 catch(ArithmeticException e)
 {
 System.out.println("Divided by zero");
 }
 System.out.println("After exception is handled");
 }}
