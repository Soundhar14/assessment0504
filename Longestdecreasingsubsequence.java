public class Longestdecreasingsubsequence {
    public static void main (String [] args){
        
    int [] arr = {1 , 2 , 3 ,4, 5, 3 ,3 ,4 ,5  , 6};
    int n = arr.length;
    int [] result = new int[100];
    int a = 0;

    for(int i = 0; i < n - 1; i++){
        if(arr[i + 1] == arr[i] + 1){
            result[a] = arr[i];
            a++; 
        }
    }
    System.out.println("Subsequence :" + result[a]);
    }
}
