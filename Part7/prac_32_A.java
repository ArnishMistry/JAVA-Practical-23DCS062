package Part7;

// import java.util.*;

class myThread extends Thread {
  public void run() {
    System.out.println("Hello World!");
  }
}

public class prac_32_A {
  public static void main(String[] args) {
    myThread t1 = new myThread();
    t1.start();
  }
}