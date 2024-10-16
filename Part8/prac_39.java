import java.util.Arrays;

public class prac_39
 {

    // Generic method to sort an array of Comparable objects
    public static <T extends Comparable<T>> void sortArray(T[] array) {
        Arrays.sort(array); // Using built-in sort method from Arrays class
    }

    public static void main(String[] args) {
        // Example with an array of Integers
        Integer[] numbers = {4, 2, 9, 1, 5, 6};
        sortArray(numbers);
        System.out.println("Sorted Integer array: " + Arrays.toString(numbers));

        // Example with an array of Strings
        String[] words = {"apple", "banana", "orange", "grape"};
        sortArray(words);
        System.out.println("Sorted String array: " + Arrays.toString(words));

        // Example with a custom class implementing Comparable
        Product[] products = {
            new Product("Laptop", 1200),
            new Product("Phone", 800),
            new Product("Tablet", 600)
        };
        sortArray(products);
        System.out.println("Sorted Product array by price: " + Arrays.toString(products));
    }
}

// Example custom class that implements Comparable
class Product implements Comparable<Product> {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Product other) {
        return Integer.compare(this.price, other.price); // Sorting by price
    }

    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}
