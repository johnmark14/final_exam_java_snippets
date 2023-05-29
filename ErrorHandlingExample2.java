public class ErrorHandlingExample {

    public static void main(String[] args) {
        try {
            String str = null;
            int length = str.length();
            System.out.println("Length: " + length);
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception occurred!");
        } catch (Exception e) {
            System.out.println("Exception occurred!");
        }
    }
}
