public class SumCalculator {
     int sumCalc = 0;

    public int sum(int n) {
        if (n == 0) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i <= n; i++) {
            sumCalc =sumCalc + i;
        }
        return sumCalc;

    }
}
