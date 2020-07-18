class A
{
 void m1(int a)
 {
   System.out.println("method with single parameter get executed");
 }
 void m1(int a,int b)
 {
   System.out.println("method with 2 parameters get executed");
 }
 void m1(char a)
 {
   System.out.println("method with char any get executed");
 }
}
class main
{
 public static void main(String ar[])
 {
  A a=new A();
  a.m1(10,20);
  a.m1(20);
  a.m1('c');
 }
}