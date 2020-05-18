import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String myString = input.nextLine();

        LinkedList<Character> max = new LinkedList<>();

        // Find the maximum increasingly ordered subsequence
        for (int i = 0; i < myString.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(myString.charAt(i));
            for (int j = i + 1; j < myString.length(); j++) {
                if (myString.charAt(j) > list.getLast()) {
                    list.add(myString.charAt(j));
                }
            }

            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }

        // Display the maximum consecutive
        // increasingly ordered substring
        for (Character ch: max) { // single loop
            System.out.print(ch); // Simple statement
        }
        System.out.println();
    }
}
