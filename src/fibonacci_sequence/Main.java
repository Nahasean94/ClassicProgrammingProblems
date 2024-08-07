package fibonacci_sequence;


public class Main {
    public static void main(String[] args) {
        System.out.println(fib2(400));
    }
    private static int fib2(int n) {
        if (n < 2) { return n; }
        return fib2(n - 1) + fib2(n - 2);
    }

}
