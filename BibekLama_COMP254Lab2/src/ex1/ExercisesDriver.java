package ex1;

public class ExercisesDriver {
    public static void main(String[] args) {
        // sample array
        int[] myArray = {1, 2, 3, 4, 5};
        int[] secondArray = {15, 15, 15, 15, 15}; // example for example5

        // example1
        System.out.println("example1: " + Exercises.example1(myArray));

        // example2
        System.out.println("example2: " + Exercises.example2(myArray));

        // example3
        System.out.println("example3: " + Exercises.example3(myArray));

        // example4
        System.out.println("example4: " + Exercises.example4(myArray));

        // example5
        System.out.println("example5: " + Exercises.example5(myArray, secondArray));
    }
}
