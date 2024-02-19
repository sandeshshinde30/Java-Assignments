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


