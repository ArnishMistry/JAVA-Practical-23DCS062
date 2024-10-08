package Part7;

class MyRunnable implements Runnable {
    static int count = 0;

    @Override
    public void run() {
        try {
            count++;
            System.out.println("Thread: Count is " + count);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

public class prac_35 {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread: Execution " + i);

            Thread thread = new Thread(myRunnable);
            thread.start();

            try {
                thread.join();

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
