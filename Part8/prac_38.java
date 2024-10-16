import java.util.ArrayList;

public class prac_38 {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack size: " + stack.getSize());  
        System.out.println("Top element: " + stack.peek());    

        System.out.println("Popped element: " + stack.pop());   
        System.out.println("Stack size after pop: " + stack.getSize());  

        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}

class MyStack {
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        if (!isEmpty()) {
            return list.get(list.size() - 1);
        } else {
            throw new RuntimeException("Stack is empty");
        }
    }

    public Object pop() {
        if (!isEmpty()) {
            return list.remove(list.size() - 1);
        } else {
            throw new RuntimeException("Stack is empty");
        }
    }

    public void push(Object o) {
        list.add(o);
    }
}