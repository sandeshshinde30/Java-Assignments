/*
    Ques : Create a thread using Thread class and Runnable class.
    Name : Sandesh Shivaji Shinde
    PRN : 23620006
 */

public class Ques_4_1 extends Thread {
    public void run() {
        System.out.println("Thread using Thread class is running.");
    }

    public static void main(String[] args) {
        Ques_4_1 thread = new Ques_4_1();
        thread.start(); // Start the thread
    }
}
