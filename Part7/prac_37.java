package Part7;

import java.util.LinkedList;

class Buffer {
    private LinkedList<Integer> list = new LinkedList<>();
    private int capacity = 5; 

    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (this) {
                while (list.size() == capacity) {
                    wait();
                }

                System.out.println("Producer produced: " + value);
                list.add(value++); 

                notify();

                Thread.sleep(1000);
            }
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while (list.isEmpty()) {
                    wait();
                }

                int value = list.removeFirst(); 
                System.out.println("Consumer consumed: " + value);

                notify();

                Thread.sleep(1500);
            }
        }
    }
}

public class prac_37{
    public static void main(String[] args) throws InterruptedException {
        Buffer buffer = new Buffer();

        Thread producerThread = new Thread(() -> {
            try {
                buffer.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumerThread = new Thread(() -> {
            try {
                buffer.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producerThread.start();
        consumerThread.start();

        producerThread.join();
        consumerThread.join();
    }
}
