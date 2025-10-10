package Ex3;
import java.io.File;
import java.util.Scanner;

public class BibekLama_COMP254Lab3_Ex3 {

    static boolean foundAny = false;

    public static void find(String path, String filename) {
        File dir = new File(path);
        File[] files = dir.listFiles();
        if (files == null) return;

        for (File f : files) {
            
            if (f.getName().equalsIgnoreCase(filename)) {
                System.out.println(" Found: " + f.getAbsolutePath());
                foundAny = true;
            }

            if (f.isDirectory()) {
                find(f.getAbsolutePath(), filename);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting directory path: ");
        String path = sc.nextLine();
        System.out.print("Enter filename or folder name to search: ");
        String filename = sc.nextLine();
        sc.close();

        System.out.println("\n Searching for \"" + filename + "\" inside " + path + "...\n");
        find(path, filename);

        if (!foundAny)
            System.out.println("No file or folder named \"" + filename + "\" was found in this directory.");
        else
            System.out.println("\n Search completed successfully.");
    }
}
