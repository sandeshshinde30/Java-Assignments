
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
