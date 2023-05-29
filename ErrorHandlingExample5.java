public class ErrorHandlingExample {

    public static void main(String[] args) {
        try {
            String str = "Hello";
            int number = Integer.parseInt(str);
            System.out.println("Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Number format exception occurred!");
        } catch (Exception e) {
            System.out.println("Exception occurred!");
        }
    }
}
