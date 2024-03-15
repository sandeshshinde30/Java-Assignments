/* Name : Sandesh Shivaji Shinde 
PRN : 23620006
Ques. : Write a java program to create a class called STUDENT with data
members PRN, Name and age. Using inheritance, create a classes called
UGSTUDENT and PGSTUDENT having fields as semester, fees and
stipend. Enter the data for at least 5 students. Find the semester wise
average age for all UG and PG students separately.
*/

import java.util.*;

class STUDENT {
    protected int PRN;
    protected String Name;
    protected int age;

    public STUDENT(int PRN, String Name, int age) {
        this.PRN = PRN;
        this.Name = Name;
        this.age = age;
    }
}

class UGSTUDENT extends STUDENT {
    private int semester;
    private double fees;

    public UGSTUDENT(int PRN, String Name, int age, int semester, double fees) {
        super(PRN, Name, age);
        this.semester = semester;
        this.fees = fees;
    }

    public int getSemester() {
        return semester;
    }

    public double getFees() {
        return fees;
    }
}

class PGSTUDENT extends STUDENT {
    private int semester;
    private double stipend;

    public PGSTUDENT(int PRN, String Name, int age, int semester, double stipend) {
        super(PRN, Name, age);
        this.semester = semester;
        this.stipend = stipend;
    }

    public int getSemester() {
        return semester;
    }

    public double getStipend() {
        return stipend;
    }
}

class student1
{
    public static void main(String args[])
    {
        UGSTUDENT ugStudent[] = new UGSTUDENT[5];
        PGSTUDENT pgStudent[] = new PGSTUDENT[5];
        Scanner scanner = new Scanner(System.in);

        int ugTotalAge=0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for UG Student " + i + ":");
            System.out.print("PRN: ");
            int prn = scanner.nextInt();
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("Semester: ");
            int semester = scanner.nextInt();
            System.out.print("Stipend: ");
            double stipend = scanner.nextDouble();
            ugTotalAge += age;
            ugStudent[i] = new UGSTUDENT(prn,name,age,semester,stipend);
        }
        double ugAvgAge = ugTotalAge / 5;
        System.out.println("Average age for UG students: " + ugAvgAge);

        int pgTotalAge=0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for PG Student " + i + ":");
            System.out.print("PRN: ");
            int prn = scanner.nextInt();
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("Semester: ");
            int semester = scanner.nextInt();
            System.out.print("Stipend: ");
            double stipend = scanner.nextDouble();
            ugTotalAge += age;
            pgStudent[i] = new PGSTUDENT(prn,name,age,semester,stipend);
        }
        double pgAvgAge = pgTotalAge / 5;
        System.out.println("Average age for UG students: " + pgAvgAge);

    }
}