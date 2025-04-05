import java.util.*;

public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];

        System.out.println("Enter the values in the array: ");
        for (int j = 0; j < len; j++) {
            arr[j] = sc.nextInt();
        }

        sc.close();
        
        int lastDuplicate = findDuplicate(arr, len);

        System.out.println("Last duplicate element in the array is: " + dup);
    }

    public static int findDuplicate(int[] arr, int len) {
        Set<Integer> seen = new HashSet<>();
        int dup = -1;

        for (int i = 0; i < len; i++) {
            if (seen.contains(arr[i])) {
                dup = arr[i];  
            } else {
                seen.add(arr[i]); 
            }
        }

        return dup;  
    }
}
