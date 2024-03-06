// Implement hybrid inheritance using all access specifiers (public, private,protected).

public class hybrid {
    public static void main(String[] args) {
        child child = new child();

        System.out.println("Accessing members and methods of parent from child:");
        System.out.println("Protected member in ParentClass accessed from child: " + child.protectedMember);
        child.protectedMethod();
        System.out.println("Public member in ParentClass accessed from child: " + child.publicMember);
        child.publicMethod();
        child.display();

        System.out.println("\nAccessing members and methods of child:");
        System.out.println("Protected member in child: " + child.protectedChildMember);
        child.protectedChildMethod();
        System.out.println("Public member in child: " + child.publicChildMember);
        child.publicChildMethod();
        child.displayChild();
    }
}

class parent {
    private int privateMember = 10;
    protected int protectedMember = 20;
    public int publicMember = 30;

    private void privateMethod() {
        System.out.println("Private method in parent");
    }

    protected void protectedMethod() {
        System.out.println("Protected method in parent");
    }

    public void publicMethod() {
        System.out.println("Public method in parent");
    }

    public void display() {
        System.out.println("Private member in parent: " + privateMember);
        System.out.println("Protected member in parent: " + protectedMember);
        System.out.println("Public member in parent: " + publicMember);
        privateMethod();
        protectedMethod();
        publicMethod();
    }
}


class child extends parent {
    private int privateChildMember = 40;
    protected int protectedChildMember = 50;
    public int publicChildMember = 60;

    private void privateChildMethod() {
        System.out.println("Private method in child");
    }

    protected void protectedChildMethod() {
        System.out.println("Protected method in child");
    }

    public void publicChildMethod() {
        System.out.println("Public method in child");
    }

    public void displayChild() {
        System.out.println("Private member in child: " + privateChildMember);
        System.out.println("Protected member in child: " + protectedChildMember);
        System.out.println("Public member in child: " + publicChildMember);
        privateChildMethod();
        protectedChildMethod();
        publicChildMethod();
    }
}




