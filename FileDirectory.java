import java.io.*;
class FileDirec {
 static void print(File arr[])
 {
 for(File f:arr)
 {
 if(f.isDirectory())
 {
 System.out.println(f.getName()+" is a directory ")
;
 print(f.listFiles());
 }
 if(f.isFile())
 System.out.println("----"+f.getName()+" is a file");
 }
 }
 public static void main(String ars[])
 {
 File mydir=new File("../OS");
 if(mydir.isDirectory())
 {
 File arr[]=mydir.listFiles();
 print(arr);
 }
 } 
}
