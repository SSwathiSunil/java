class Rect
{
int a,b;
Rect(int x,int y)
{
a=x;
b=y;
}
void area()
{
System.out.println("AREA:"+a*b);
}
}

class Main
{
public static void main(String[] args)
{
Rect r1 = new Rect(10,5);
r1.area();
}
}
