import java.io.*;
class MyFileWriter{
public static void main(String args[])throws IOException{
FileWriter fw=new FileWriter("anu.txt");
String s="hello welcome to java programming";
char ch[]=s.toCharArray();
for (int i=0; i<ch.length; i++)
fw.write(ch[i]);
fw.close();
}
}
