class Rect
{
int a,b;
Rect()
{
a=5;
b=10;
}
void area()
{
System.out.println("area is:"+a*b);
}
}

class Main
{
public static void main(String[] args)
{
Rect r1=new Rect();
r1.area();
}
}
