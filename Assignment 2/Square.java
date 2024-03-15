/* Name : Sandesh Shivaji Shinde 
PRN : 23620006
Ques. : Create a class named &#39;Shape&#39; with a method to print &quot;This is This is
shape&quot;. Then create two other classes named &#39;Rectangle&#39;, &#39;Circle&#39;
inheriting the Shape class, both having a method to print &quot;This is
rectangular shape&quot; and &quot;This is circular shape&quot; respectively. Create a
subclass &#39;Square&#39; of &#39;Rectangle&#39; having a method to print &quot;Square is a
rectangle&quot;. Now call the method of &#39;Shape&#39; and &#39;Rectangle&#39; class by the
object of &#39;Square&#39; class.
*/


class Shape {
    public void displayShape() {
        System.out.println("This is shape");
    }
}

class Rectangle extends Shape {
    public void displayRect() {
        System.out.println("This is rectangular shape");
    }
}

class Circle extends Shape {
    public void displayCircle() {
        System.out.println("This is circular shape");
    }
}

class Square extends Rectangle {
    public void displaySquare() {
        System.out.println("Square is a rectangle");
    }

    public static void main(String[] args) {
        Square square = new Square();
        square.displayShape(); 
        square.displayRect();
        square.displaySquare(); 

    }
}


