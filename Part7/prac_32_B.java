package Part7;

// import java.util.*;

class myThread implements Runnable {
  public void run() {
    System.out.println("Hello World!");
  }
}

public class prac_32_B {
  public static void main(String[] args) {
    Thread t1 = new Thread(new myThread());
    t1.start();
  }
}
