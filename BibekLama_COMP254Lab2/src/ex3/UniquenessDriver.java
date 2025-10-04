package ex3;

import java.util.Random;

public class UniquenessDriver {
    public static void main(String[] args) {
        int[] sizes = {1000, 5000, 10000, 20000, 50000, 100000};

        Random rand = new Random();

        for (int n : sizes) {
            int[] data = new int[n];
            for (int i = 0; i < n; i++) {
                data[i] = rand.nextInt(n * 10);  // fill with random numbers
            }

            // unique1 timing
            long start = System.currentTimeMillis();
            Uniqueness.unique1(data);
            long end = System.currentTimeMillis();
            long time1 = end - start;

            // unique2 timing
            start = System.currentTimeMillis();
            Uniqueness.unique2(data);
            end = System.currentTimeMillis();
            long time2 = end - start;

            System.out.println("n=" + n + 
                               " | unique1=" + time1 + " ms" +
                               " | unique2=" + time2 + " ms");
        }
    }
}

