import java.util.Scanner;
class Exception
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:::");
int a=sc.nextInt();
System.out.println("enter another number:::");
int b=sc.nextInt();

try
{
int c=a/(a-b);
System.out.println("c="+c);
}

catch(ArithmeticException e)
{
System.out.println("Arithmetic Exception:: ....."+e);
}
finally
{
System.out.println("final block");
}
System.out.println("a="+a);
System.out.println("b="+b);
System.out.println("end byee");
}
}
