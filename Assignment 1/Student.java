import java.util.*;

public class Student
{
    int rollNo;
    float cgpa;
    String name;
    char grade;

    Scanner sc = new Scanner(System.in);

    public void setData()
    {
        System.out.print("Enter Name    : ");
        name = sc.nextLine();

        System.out.print("Enter Roll No : ");
        rollNo = sc.nextInt();

        System.out.print("Enter CGPA    : ");
        cgpa = sc.nextFloat();

        System.out.print("Enter Grade   : ");
        grade = sc.next().charAt(0);
    }

    public void getData()
    {
        System.out.println("\nName : "+name);
        System.out.println("Roll No. : "+rollNo);
        System.out.println("CGPA : "+cgpa);
        System.out.println("Grade : "+grade);
    }

    public static void main(String args[])
    {
        Student s = new Student();
        s.setData();
        s.getData();
    }
}
