public class Student1{
int salary;
String name;
public Student1(int salary,String name){
this.salary=salary;
this.name=name;
}
void display()
{
System.out.println(name+" "+salary);
}
public static void main(String args[]){
Student1 s1=new Student1(143,"anu");
Student1 s2=new Student1(143,"yashu");
s1.display();
s2.display();
}
}

