/*
    Ques : Demonstrate how to use static inner class and non-static inner class to
            access static and non-static members of outer class.
 */

public class Ques_3 {
    private static int staticOutVar = 10;
    private int nonstaticOutVar = 20;

    public static class StaticInnerClass {
        public void accessOuterStatic() {
            System.out.println("Accessing outer static variable from static inner class: " + staticOutVar);
        }
    }

    public class NonStaticInnerClass {
        public void accessOuterNonStatic() {
            System.out.println("Accessing outer static variable from non-static inner class: " + staticOutVar);
            System.out.println("Accessing outer non-static variable from non-static inner class: " + nonstaticOutVar);
        }
    }

    public static void main(String[] args) {

        Ques_3.StaticInnerClass staticInnerObj = new Ques_3.StaticInnerClass();
        staticInnerObj.accessOuterStatic();

        Ques_3 outerObj = new Ques_3();
        Ques_3.NonStaticInnerClass nonStaticInnerObj = outerObj.new NonStaticInnerClass();
        nonStaticInnerObj.accessOuterNonStatic();
    }
}
