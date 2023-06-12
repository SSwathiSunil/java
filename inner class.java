import java.util.Scanner;
class Student
{
 int rollno,mark;
 String name;
 Student()
{
   Scanner sc=new Scanner(System.in);
   System.out.println("enter roll no::");
   rollno=sc.nextInt();
   System.out.println("enter name::");
   name=sc.next();
   System.out.println("enter mark::");
   mark=sc.nextInt();
}

class Sports
{
 String sports_name;
 int activity_point;
 Sports()
{
   Scanner sc=new Scanner(System.in);
   System.out.println("enter sports name:");
   sports_name=sc.next();
   System.out.println("enter activity point::");
   activity_point=sc.nextInt();
}
void Show()
{
   System.out.println("rollno::"+rollno);
   System.out.println("name::"+name);
   System.out.println("mark::"+mark);
   System.out.println("sports_name::"+sports_name);
   System.out.println("activity_point::"+activity_point);
}
}
}
class Main
{
 public static void main(String args[])
{
 Student b=new Student();
    Student.Sports b1=b.new Sports();

    b1.Show();
}
}