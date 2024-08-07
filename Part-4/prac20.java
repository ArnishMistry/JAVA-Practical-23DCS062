class Shape {
    public void displayShape() {
        System.out.println("This is a shape.");
    }
}

class Rectangle extends Shape {
    public void displayRectangle() {
        System.out.println("This is rectanglar shape.");
    }
}

class Square extends Rectangle {
    public void displaySquare() {
        System.out.println("Square is a rectangle");
    }
}

class Circle extends Shape {
    public void displayCircle() {
        System.out.println("This is circular shape.");
    }
}

public class prac20 {
    public static void main(String[] args) {
        Square square = new Square();

        square.displayShape();                      //Calling Shape class method using object of Square class
        square.displayRectangle();                  //Calling Rectangle class method using object of Square class
        square.displaySquare();                     //Calling Square class method using object of Square class
    }
}
