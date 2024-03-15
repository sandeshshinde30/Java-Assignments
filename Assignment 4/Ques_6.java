
/*
    Ques : An abstract class has a construtor which prints "This is constructor of
        abstract class", an abstract method named 'a method' and a non-abstract
        method which prints "This is a normal method of abstract class". A class
        'SubClass' inherits the abstract class and has a method named 'a method'
        which prints "This is abstract method". Now create an object of
        'SubClass' and call the abstract method and the non-abstract method.
*/

// Abstract class
abstract class AbstractClass {
    
    AbstractClass() {
        System.out.println("This is constructor of abstract class");
    }

    abstract void a_method();

    void normalMethod() {
        System.out.println("This is a normal method of abstract class");
    }
}

// Subclass
class SubClass extends AbstractClass {
   
    void a_method() {
        System.out.println("This is abstract method");
    }
}

public class Ques_6 {
    public static void main(String[] args) {
       
        SubClass obj = new SubClass();
        
        obj.a_method();

        obj.normalMethod();
    }
}
