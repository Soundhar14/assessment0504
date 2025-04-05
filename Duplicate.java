import java.util.*;
public class Duplicate {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int [] arr = new int[len];
        int a = 0 ;

        System.out.println("Enter the values in the array : ");

        for(int j = 0 ; j < len; j++){
            arr[j] = sc.nextInt(); 
        }

        sc.close();

        demo(arr , len , a);

        System.out.println("last duplicate element in the array is : " + a);

    }

    public static int demo (int [] arr , int len , int a){
        for (int i = 1; i < len  ; i++){
            if (arr[i] == arr[i - 1]){
                a = arr[i];
            }
        }
        return a;
    }

}
