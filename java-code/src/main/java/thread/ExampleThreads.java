package thread;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class ExampleThreads {
    public static long getFactorial(long f) {
        return (f <= 1) ? 1 : LongStream.rangeClosed(2, f).reduce((x, y) -> x * y).getAsLong();
    }

    public static void main(String[] args) {
        IntStream.rangeClosed(1, 20)
                .forEach(i -> {
                    Thread myThread = new Thread(() -> {
                        long before = System.nanoTime();
                        System.out.printf("%s started... \n", Thread.currentThread().getName());
                        System.out.printf("%s! = %s \n", i, getFactorial(i));
                        long after = System.nanoTime();
                        System.err.printf("%s finished... WorkTime: %s \n"
                                , Thread.currentThread().getName()
                                , (after - before));
                    }, "Thread-" + i);
                    myThread.start();
                });
    }
}
