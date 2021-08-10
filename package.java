//creation
package pack1;
public class Demo1
{
 public Demo1()
 {
 System.out.println("In Demo1 ......");
 }
}
//javac -d. Demo1.java



//importing
import pack1.Demo1;
class PackageDemo {
 public static void main(String[] args)
 {
 Demo1 ob =new Demo1();
 System.out.println("In the Main method ");
 }
}
//javac PackageDemo.java
