package ex2;

public class PrefixAverageDriver {
    public static void main(String[] args) {
        double[] nums = {1, 2, 3, 4, 5};

        double[] result1 = PrefixAverage.prefixAverage1(nums);
        double[] result2 = PrefixAverage.prefixAverage2(nums);

        System.out.print("prefixAverage1: ");
        for (double val : result1) System.out.print(val + " ");
        System.out.println();

        System.out.print("prefixAverage2: ");
        for (double val : result2) System.out.print(val + " ");
        System.out.println();
    }
}
