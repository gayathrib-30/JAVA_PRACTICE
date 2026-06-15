public class Handle1 {

    public static void main(String[] args) {
        int a = 30, b = 0;
        System.out.println("Start");
        System.out.println(a + b);
        System.out.println(a - b);

        try {
            System.out.println(a / b);

        } catch (ArithmeticException e) {
            System.out.println("I HAVE HANDLED UR PROBLEM");
        }
        System.out.println(a * b);
        System.out.println("bye");

    }
}