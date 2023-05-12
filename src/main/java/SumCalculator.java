import java.util.stream.IntStream;

public class SumCalculator {

    public int sum(int n) {
        int sumCalc = 0;
        if (n == 0) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i <= n; i++) {
            sumCalc =sumCalc + i;
        }

        return IntStream.rangeClosed(0,n).sum();

    }

}
