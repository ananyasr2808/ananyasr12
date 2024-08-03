public class Student1{
int salary;
String name;
public Student1(int salary,String name){
this.salary=salary;
this.name=name;
public static void main(String args[]){
Student1 s1=new Student1(1000,"anu");
Student1 s2=new Student1(2000,"thanu");
s1.display();
s2.display();
}
}

