package handyPrograms;



//Java program to demonstrate that we can have
//different return types if return type in
//overridden method is sub-type

//Two classes used for return types.
class A {}
class B extends A {}

class Bases
{
 A fun()
 {
     System.out.println("Bases fun()");
     return new A();
 }
}

class Derivedd extends Bases
{
 B fun()
 {
     System.out.println("Derivedd fun()");
     return new B();
 }
}

public class Covariant_return_Type_Example
{
 public static void main(String args[])
 {
    Bases Bases = new Bases();
    Bases.fun();

    Derivedd Derivedd = new Derivedd();
    Derivedd.fun();
 }
}
