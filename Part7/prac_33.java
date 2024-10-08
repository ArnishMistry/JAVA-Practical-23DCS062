package Part7;

class SumThread extends Thread {
  private int start;
  private int end;
  private long partialSum;

  public SumThread(int start, int end) {
      this.start = start;
      this.end = end;
      this.partialSum = 0;
  }

  @Override
  public void run() {
      for (int i = start; i <= end; i++) {
          partialSum += i;
      }
  }

  public long getPartialSum() {
      return partialSum;
  }
}

public class prac_33 {
  public static void main(String[] args) {
      if (args.length < 2) {
          System.out.println("Please provide two arguments: N and number of threads.");
          return;
      }

      int N = Integer.parseInt(args[0]); 
      int numThreads = Integer.parseInt(args[1]); 

      SumThread[] threads = new SumThread[numThreads];

      int rangePerThread = N / numThreads;
      int start = 1;

      for (int i = 0; i < numThreads; i++) {
          int end = start + rangePerThread - 1;
          if (i == numThreads - 1) {
              end = N;
          }

          threads[i] = new SumThread(start, end);
          threads[i].start();

          start = end + 1;
      }

      long totalSum = 0;
      for (int i = 0; i < numThreads; i++) {
          try {
              threads[i].join();
              totalSum += threads[i].getPartialSum();
          } catch (InterruptedException e) {
              System.out.println("Error: " + e.getMessage());
          }
      }

      System.out.println("The sum of numbers from 1 to " + N + " is: " + totalSum);
  }
}
