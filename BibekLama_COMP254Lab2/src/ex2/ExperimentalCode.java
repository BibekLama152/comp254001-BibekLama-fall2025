package ex2;

public class ExperimentalCode {
    public static void main(String[] args) {
        int[] sizes = {1000, 5000, 10000, 20000};

        for (int n : sizes) {
            double[] nums = new double[n];
            for (int i = 0; i < n; i++) nums[i] = i; // fill array

            long start = System.nanoTime();
            PrefixAverage.prefixAverage1(nums);
            long end = System.nanoTime();
            System.out.println("prefixAverage1, n=" + n + " time=" + (end - start) + " ns");

            start = System.nanoTime();
            PrefixAverage.prefixAverage2(nums);
            end = System.nanoTime();
            System.out.println("prefixAverage2, n=" + n + " time=" + (end - start) + " ns");

            System.out.println("----------------------------");
        }
    }
}
