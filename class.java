import java.util.Scanner;
class Area{
int length,breadth;
void read(){
Scanner input=new Scanner(System.in);
System.out.println("enter the length of the rectangle:");
length=input.nextInt();
System.out.println("enter the breadth of the rectangle:");
breadth=input.nextInt();
}
void area(){
int area=length*breadth;
System.out.println("area is:"+area);
}
void perimeter(){
int perimeter=2*(length+breadth);
System.out.println("perimeter is:"+perimeter);
}
}

class Main{
public static void main(String[]args){
Area a=new Area();
a.read();
a.area();
a.perimeter();
