import java.util.*;

public class PanagramProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence or phrase:");
        String input = scanner.nextLine();
        
        if (isPangram(input)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
    
    public static boolean isPangram(String input) {
        // Convert input to lowercase to ignore case
        input = input.toLowerCase();
        
        // Initialize a boolean array to track which letters have been seen
        boolean[] seen = new boolean[26];
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                int index = ch - 'a'; // Convert character to index (0-25)
                seen[index] = true;
            }
        }
        
        // Check if all letters have been seen
        for (boolean value : seen) {
            if (!value) {
                return false;
            }
        }
        
        return true;
    }
}