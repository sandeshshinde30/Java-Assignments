/*
    Ques : Write a program to display thread information.
    Name : Sandesh Shivaji Shinde
    PRN : 23620006
 */

public class Ques_3 {

    public static void main(String[] args) {
        // Get a reference to the current thread
        Thread mainThread = Thread.currentThread();
        
        // Display information about the main thread
        System.out.println("Main Thread:");
        System.out.println("Thread name: " + mainThread.getName());
        System.out.println("Thread ID: " + mainThread.getId());
        System.out.println("Thread priority: " + mainThread.getPriority());
        System.out.println("Thread state: " + mainThread.getState());
        System.out.println("Thread is daemon: " + mainThread.isDaemon());
        System.out.println();

        // Display information about all active threads
        System.out.println("Currently active threads:");
        ThreadGroup currentThreadGroup = Thread.currentThread().getThreadGroup();
        Thread[] activeThreads = new Thread[currentThreadGroup.activeCount()];
        currentThreadGroup.enumerate(activeThreads);
        
        for (Thread thread : activeThreads) {
            System.out.println("Thread name: " + thread.getName());
            System.out.println("Thread ID: " + thread.getId());
            System.out.println("Thread priority: " + thread.getPriority());
            System.out.println("Thread state: " + thread.getState());
            System.out.println("Thread is daemon: " + thread.isDaemon());
            System.out.println();
        }
    }
}
