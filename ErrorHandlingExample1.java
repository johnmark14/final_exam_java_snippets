public class ErrorHandlingExample {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        try {
            int result = numbers[4] / 0;
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds!");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occurred!");
        } catch (Exception e) {
            System.out.println("Exception occurred!");
        }
    }
}
