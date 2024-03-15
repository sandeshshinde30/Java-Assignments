/* Name : Sandesh Shivaji Shinde 
    PRN : 23620006
    Ques.Write a program to implement a class Teacher contains two fields Name
and Qualification. Extend the class to Department, it contains Dept. No
and Dept. Name. An Interface named as College it contains one field
Name of the College. Using the above classes and Interface get the
appropriate information and display it.
 */

interface College {
    String collegeName = "Government Polytechnic Kolhapur";
}

class Department extends teacher implements College {
    int deptNo;
    String deptName;

    Department(String name, String qualification, int deptNo, String deptName) {
        super(name, qualification);
        this.deptNo = deptNo;
        this.deptName = deptName;
    }

    void displayInfo() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Teacher Qualification: " + qualification);
        System.out.println("Department Number: " + deptNo);
        System.out.println("Department Name: " + deptName);
        System.out.println("College Name: " + collegeName); 
    }
}


class teacher {
    String name;
    String qualification;

    teacher(String name, String qualification) {
        this.name = name;
        this.qualification = qualification;
    }

    public static void main(String[] args) {
        Department department = new Department("Sandesh", "Diploma", 6106, "Information Technology");
        department.displayInfo();
    }
}


