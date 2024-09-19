package Part5;

public class prac_25 {
    public static void main(String[] args) {
            try {
                throwException();
            } 
            catch (Exception e) {
                System.out.println("Caught an exception: " + e.getMessage());
            }
        }

        public static void throwException() throws Exception {
            System.out.println("Inside throwException method.");
            
            throw new Exception("This is a custom exception message.");
        }

}
