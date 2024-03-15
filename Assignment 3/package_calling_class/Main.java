import useful.Useme;

public class Main {
    public static void main(String[] args) {
        
        Useme useme = new Useme();

        double rectangleArea = useme.area(5, 10);
        System.out.println("Area of rectangle: " + rectangleArea);

        double totalMarks = 500;
        double obtainedMarks = 450;
        double percentage = useme.percentage(totalMarks, obtainedMarks);
        System.out.println("Percentage obtained: " + percentage + "%");
    }
}
