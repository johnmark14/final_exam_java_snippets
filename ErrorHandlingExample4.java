public class ErrorHandlingExample {

    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int result = numbers[2] / 0;
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
