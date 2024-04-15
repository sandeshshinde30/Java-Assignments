/*
    Ques : Create a thread using  Runnable class.
    Name : Sandesh Shivaji Shinde
    PRN : 23620006
 */

public class Ques_4_2 implements Runnable {
    public void run() {
        System.out.println("Thread using Runnable interface is running.");
    }

    public static void main(String[] args) {
        Ques_4_2 runnable = new Ques_4_2();
        Thread thread = new Thread(runnable); // Create a new thread with the Runnable object
        thread.start(); // Start the thread
    }
}
