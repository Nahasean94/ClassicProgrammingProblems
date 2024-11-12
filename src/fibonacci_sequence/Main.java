package fibonacci_sequence;


import java.util.stream.IntStream;

public class Main {
//  static Map<Integer, Integer> memo = new HashMap<>(Map.of(0, 0, 1, 1));
//
//
//    public static void main(String[] args) {
//        System.out.println(fib2(400));
//    }
//    private static int fib2(int n) {
//      if(!memo.containsKey(n)) {
//          memo.put(n, fib2(n - 1) + fib2(n - 2));
//      }
//      return memo.get(n);
//    }

    private int last = 0, next = 1;

    public IntStream stream() {
        return IntStream.generate(() -> {
            int oldLast = last;
            last = next;
            next = oldLast + next;
            return oldLast;

        });
    }

    public static void main(String[] args) {
        Main instance = new Main();
        instance.stream().limit(41).forEachOrdered(System.out::println);
    }

}
