    /*
        Ques : Q 1. Create objects of class student(roll number, name and gender), perform different operations on below collection components
        a. ArrayList
        b. LinkedList
        c. ArrayDeque
        d. PriorityQueue
        e. HashSet
        f. TreeSet
        g. HashMap
        h. LinkedHashMap

        Name : Sandesh Shivaji Shinde
        PRN : 23620006
    */

    import java.util.*;

    class Student {
        private int rollNumber;
        private String name;
        private String gender;

        public Student(int rollNumber, String name, String gender) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.gender = gender;
        }

        public int getRollNumber() {
            return rollNumber;
        }

        public String getName() {
            return name;
        }

        public String getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return "Roll Number: " + rollNumber + ", Name: " + name + ", Gender: " + gender;
        }
    }

    public class Ques_1 {
        public static void main(String[] args) {
            // Create objects of Student class
            Student s1 = new Student(101, "John", "Male");
            Student s2 = new Student(102, "Alice", "Female");
            Student s3 = new Student(103, "Bob", "Male");
            Student s4 = new Student(104, "Emily", "Female");
            Student s5 = new Student(105, "David", "Male");

            // a. ArrayList
            ArrayList<Student> arrayList = new ArrayList<>();
            arrayList.add(s1);
            arrayList.add(s2);
            arrayList.add(s3);
            arrayList.add(s4);
            arrayList.add(s5);
            System.out.println("ArrayList:");
            displayStudents(arrayList);

            // b. LinkedList
            LinkedList<Student> linkedList = new LinkedList<>();
            linkedList.add(s1);
            linkedList.add(s2);
            linkedList.add(s3);
            linkedList.add(s4);
            linkedList.add(s5);
            System.out.println("\nLinkedList:");
            displayStudents(linkedList);

            // c. ArrayDeque
            ArrayDeque<Student> arrayDeque = new ArrayDeque<>();
            arrayDeque.add(s1);
            arrayDeque.add(s2);
            arrayDeque.add(s3);
            arrayDeque.add(s4);
            arrayDeque.add(s5);
            System.out.println("\nArrayDeque:");
            displayStudents(arrayDeque);

            // d. PriorityQueue
            PriorityQueue<Student> priorityQueue = new PriorityQueue<>(Comparator.comparing(Student::getRollNumber));
            priorityQueue.add(s3);
            priorityQueue.add(s2);
            priorityQueue.add(s5);
            priorityQueue.add(s4);
            priorityQueue.add(s1);
            System.out.println("\nPriorityQueue:");
            displayStudents(priorityQueue);

            // e. HashSet
            HashSet<Student> hashSet = new HashSet<>();
            hashSet.add(s1);
            hashSet.add(s2);
            hashSet.add(s3);
            hashSet.add(s4);
            hashSet.add(s5);
            System.out.println("\nHashSet:");
            displayStudents(hashSet);

            // f. TreeSet
            TreeSet<Student> treeSet = new TreeSet<>(Comparator.comparing(Student::getRollNumber));
            treeSet.add(s3);
            treeSet.add(s2);
            treeSet.add(s5);
            treeSet.add(s4);
            treeSet.add(s1);
            System.out.println("\nTreeSet:");
            displayStudents(treeSet);

            // g. HashMap
            HashMap<Integer, Student> hashMap = new HashMap<>();
            hashMap.put(s1.getRollNumber(), s1);
            hashMap.put(s2.getRollNumber(), s2);
            hashMap.put(s3.getRollNumber(), s3);
            hashMap.put(s4.getRollNumber(), s4);
            hashMap.put(s5.getRollNumber(), s5);
            System.out.println("\nHashMap:");
            displayStudents(hashMap.values());

            // h. LinkedHashMap
            LinkedHashMap<Integer, Student> linkedHashMap = new LinkedHashMap<>();
            linkedHashMap.put(s1.getRollNumber(), s1);
            linkedHashMap.put(s2.getRollNumber(), s2);
            linkedHashMap.put(s3.getRollNumber(), s3);
            linkedHashMap.put(s4.getRollNumber(), s4);
            linkedHashMap.put(s5.getRollNumber(), s5);
            System.out.println("\nLinkedHashMap:");
            displayStudents(linkedHashMap.values());
        }

        // Helper method to display students
        private static void displayStudents(Collection<Student> students) {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
