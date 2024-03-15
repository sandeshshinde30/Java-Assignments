/* Name : Sandesh Shivaji Shinde 
PRN : 23620006
Ques. : Create game characters using the concept of inheritance. Suppose, in your
game, you want three characters - a maths teacher, a footballer and a
businessman. Since, all of the characters are persons, they can walk and
talk. However, they also have some special skills. A maths teacher can
teach maths, a footballer can play football and a businessman can run a
business. You can individually create three classes who can walk, talk
and perform their special skill as shown in the figure below.

In each of the classes, you would be copying the same code for walk and
talk for each character. If you want to add a new feature - eat, you need to
implement the same code for each character. This can easily become error
prone (when copying) and duplicate codes. It&#39;d be a lot easier if we had a
Person class with basic features like talk, walk, eat, sleep, and add special

skills to those features as per our characters. This is done using
inheritance.

Using inheritance, now you don&#39;t implement the same code for walk and
talk for each class. You just need to inherit them. So, for Maths teacher
(derived class), you inherit all features of a Person (base class) and add a
new feature TeachMaths. Likewise, for a footballer, you inherit all the
features of a Person and add a new feature PlayFootball and so on.
*/
class Person {
    void walk() 
    {
        System.out.println("Person is walking");
    }

    void talk() 
    {
        System.out.println("Person is talking");
    }

    void eat() 
    {
        System.out.println("Person is eating");
    }

    void sleep() 
    {
        System.out.println("Person is sleeping");
    }
}

class MathsTeacher extends Person {
    void teachMaths() 
    {
        System.out.println("Maths teacher is teaching maths");
    }
}

class Footballer extends Person {
    void playFootball() 
    {
        System.out.println("Footballer is playing football");
    }
}

class Businessman extends Person {
    void runBusiness() {
        System.out.println("Businessman is running a business");
    }
}

public class game {
    public static void main(String[] args) {
        MathsTeacher mathsTeacher = new MathsTeacher();
        mathsTeacher.walk();
        mathsTeacher.talk();
        mathsTeacher.eat();
        mathsTeacher.sleep();
        mathsTeacher.teachMaths();

        Footballer footballer = new Footballer();
        footballer.walk();
        footballer.talk();
        footballer.eat();
        footballer.sleep();
        footballer.playFootball();

        Businessman businessman = new Businessman();
        businessman.walk();
        businessman.talk();
        businessman.eat();
        businessman.sleep();
        businessman.runBusiness();
    }
}
