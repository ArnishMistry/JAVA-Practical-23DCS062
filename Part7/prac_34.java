package Part7;

import java.util.Random;

class NumberGenerator extends Thread {
    public int number;
    public boolean isEven;

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            number = random.nextInt(100); 
            System.out.println("Generated Number: " + number);

            if (number % 2 == 0) {
                isEven = true;
            } else {
                isEven = false;
            }

            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}

class SquareCalculator extends Thread {
    private NumberGenerator generator;

    public SquareCalculator(NumberGenerator generator) {
        this.generator = generator;
    }

    @Override
    public void run() {
        while (true) {
            if (generator.isEven) {
                int square = generator.number * generator.number;
                System.out.println("Square of " + generator.number + " is: " + square);
            }
            try {
                Thread.sleep(1000); // Small delay to avoid busy waiting
            } catch (InterruptedException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}

class CubeCalculator extends Thread {
    private NumberGenerator generator;

    public CubeCalculator(NumberGenerator generator) {
        this.generator = generator;
    }

    @Override
    public void run() {
        while (true) {
            if (!generator.isEven) {
                int cube = generator.number * generator.number * generator.number;
                System.out.println("Cube of " + generator.number + " is: " + cube);
            }
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}

public class prac_34 {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        SquareCalculator squareCalculator = new SquareCalculator(numberGenerator);
        CubeCalculator cubeCalculator = new CubeCalculator(numberGenerator);
        
        numberGenerator.start();
        squareCalculator.start();
        cubeCalculator.start();
    }
}
