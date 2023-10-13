import java.util.*;

public class ShuffleProgram {
    public static void main(String[] args) {
        // Create an array with the values (1, 2, 3, 4, 5, 6, 7)
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        
        // Shuffle the array
        shuffleArray(arr);
        
        // Print the shuffled array
        System.out.println(Arrays.toString(arr));
    }
    
    public static void shuffleArray(int[] arr) {
        Random rand = new Random();
        
        for (int i = arr.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            
            // Swap arr[i] with arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}