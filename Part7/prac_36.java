package Part7;

class MyThread extends Thread {
  public MyThread(String name) {
      super(name); 
  }

  @Override
  public void run() {
      for (int i = 0; i < 5; i++) {
          System.out.println(Thread.currentThread().getName() + " is running with priority " + Thread.currentThread().getPriority());
          try {
              Thread.sleep(500);
          } catch (InterruptedException e) {
              System.out.println("Error: " + e.getMessage());
          }
      }
  }
}

public class prac_36 {
  public static void main(String[] args) {
      MyThread thread1 = new MyThread("FIRST");
      MyThread thread2 = new MyThread("SECOND");
      MyThread thread3 = new MyThread("THIRD");

      thread1.setPriority(3);
      thread2.setPriority(Thread.NORM_PRIORITY);
      thread3.setPriority(7);  

      thread1.start();
      thread2.start();
      thread3.start();
  }
}
