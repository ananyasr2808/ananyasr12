import java.io.*;
class MyFileReader{
public static void main(String args[]) throws IOException{
int i=0;
FileReader fr=new FileReader("anu.txt");
while ((i=fr.read()) !=-1)
System.out.println((char)i);
fr.close();
}
}
