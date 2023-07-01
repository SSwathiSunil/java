Rect.java

import Graphics.*;
import java.util.Scanner;
class Main2
{
      public static void main(String args[])
        {
          Graphics.Rect r1=new Graphics.Rect();
          r1.read();
        }
}

Circle.java

package Graphics;
import java.util.Scanner;
interface Area
    {
    public void read();
    }
       public class Circle
      {
       public void read()
      {
          Scanner sc=new Scanner(System.in);
          System.out.println("enter the radious::");
          int r=sc.nextInt();
          double a=3.14*r*r;
          System.out.println("area of circle::"+a);
      }
}



Squ.java

package Graphics;
import java.util.Scanner;
interface Area
    {
    public void read();
    }
       public class Squ
      {
       public void read()
      {
          Scanner sc=new Scanner(System.in);
          System.out.println("enter the length of side::");
          int l=sc.nextInt();
          int a=l*l;
          System.out.println("area of square::"+a);
      }
}


Tri.java

package Graphics;
import java.util.Scanner;
interface Area
    {
    public void read();
    }
       public class Tri
      {
       public void read()
      {
          Scanner sc=new Scanner(System.in);
          System.out.println("enter the length ::");
          int l=sc.nextInt();
          System.out.println("enter the height::");
          int h=sc.nextInt();
          int a=l*h;
          System.out.println("area of triangle::"+a);
      }
}




package.java


import Graphics.*;
import java.util.Scanner;
class Main2
{
      public static void main(String args[])
        {
          Graphics.Rect r1=new Graphics.Rect();
          Graphics.Circle c1=new Graphics.Circle();
          Graphics.Squ s1=new Graphics.Squ();
          Graphics.Tri t1=new Graphics.Tri();

          r1.read();
          c1.read();
          s1.read();
          t1.read();
        }
}
