/*
    Ques : 1.Can we call the run() method instead of start() ans : Yes you can
    Name : Sandesh Shivaji Shinde
    PRN : 23620006
 */

public class Ques_1 implements Runnable {
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        Ques_1 myThread = new Ques_1();
        // Call run() directly instead of start()
        myThread.run();
    }
}
