import java.util.Scanner;
class Complex
{
int r,i;
Complex(int r,int i)
{
this.r=r;
this.i=i;
}
Complex addComp(Complex first,Complex second)
{
Complex temp=new Complex(0,0);
temp.r=first.r + second.r;
temp.i=first.i + second.i;
return temp;
}
}
class Main
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the real part of first complex number:");
int r1=sc.nextInt();
System.out.println("enter the imaginery part of first complex number:");
int i1=sc.nextInt();
System.out.println("enter the real part of the second complex number:");
int r2=sc.nextInt();
System.out.println("enter the imaginery part of the second complex number:");
int i2=sc.nextInt();
Complex first = new Complex(r1 , i1);
Complex second = new Complex(r2 , i2);
Complex sum=new Complex(0,0);
sum=sum.addComp(first,second);

System.out.println("the complex number after addition:"+sum.r+"+"+sum.i+"i");
}
}
