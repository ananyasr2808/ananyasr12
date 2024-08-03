class Example{
private String name;
public String getname()
{
return name;
}
public void setname(String name)
{
this.name=name;
}
}

public class testencapsulation{
public static void main(String args[])
{
Example aaa=new Example();
Example abc=new Example();
aaa.setname("ananya");
abc.setname("madhurya");
System.out.println("the name is:"+aaa.getname());
System.out.println("the name is:"+abc.getname());
}
}



