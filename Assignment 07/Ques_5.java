/*
    Ques : Write a program for thread communication and synchronization.
    Name : Sandesh Shivaji Shinde
    PRN : 23620006
 */

public class Ques_5 {
    public static void main(String[] args) {
        final SharedResource sharedResource = new SharedResource();

        // Creating two threads
        Thread producerThread = new Thread(new Producer(sharedResource));
        Thread consumerThread = new Thread(new Consumer(sharedResource));

        // Start both threads
        producerThread.start();
        consumerThread.start();
    }
}

class SharedResource {
    private int data;
    private boolean produced;

    // Method for producing data
    public synchronized void produce(int newData) {
        // If data is already produced, wait for it to be consumed
        while (produced) {
            try {
                wait(); // Wait for the consumer to consume the data
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        // Produce new data
        data = newData;
        System.out.println("Produced: " + data);
        produced = true;
        
        // Notify the consumer that data is available
        notify();
    }

    // Method for consuming data
    public synchronized void consume() {
        // If data is not produced yet, wait for it to be produced
        while (!produced) {
            try {
                wait(); // Wait for the producer to produce data
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        // Consume the data
        System.out.println("Consumed: " + data);
        produced = false;
        
        // Notify the producer that data has been consumed
        notify();
    }
}

// Producer class
class Producer implements Runnable {
    private final SharedResource sharedResource;

    public Producer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            sharedResource.produce(i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Consumer class
class Consumer implements Runnable {
    private final SharedResource sharedResource;

    public Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            sharedResource.consume();
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
