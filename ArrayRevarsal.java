public class ArrayRevarsal {
    //The most naive method to reverse a array. 
    //Uses O(n) time and space complexity 
    static void NaiveApproach(int[] arr){
        int[] rev = new int[arr.length];
        for(int i = 0 ; i < arr.length;i++) rev[i] = arr[arr.length-i-1];
        for(int i = 0 ; i < arr.length;i++)arr[i] = rev[i];
    } 
    //Two pointer approach uses two pointers pointing to the start and the end, swapping the numbers
    //O(n) Time complexity and O(1) space complexity
    static void TwoPointer(int[] arr){
        int i = 0;
        int j = arr.length-1;
        int t;
        while(i<j){
            t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
    }
    //This is the Swapping method where we iterate through the array from the start to half its length
    //and replace it with the element at n-1-i
    //O(n) Time and O(1) space complexity
    static void Swapping(int[] arr){
        int t;
        for(int i = 0 ; i < arr.length/2;i++){
            t = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = t;
        }
    }
    //Using Recursion, takes three inputs i.e array, first and last element and swaps them.
    //If first is greater than or equal to last then it returns it 
    //O(n) Space and Time complexity
    static void RecursionMethod(int[] arr, int f,int l){
        if(f>=l)return;
        int t = arr[f];
        arr[f] = arr[l];
        arr[l] = t;
        RecursionMethod(arr,f+1,l-1);
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        NaiveApproach(arr);
        System.out.println("1. Naive Approach: ");
        for(int i : arr)System.out.print(i + " ");
        TwoPointer(arr);
        System.out.println("\n2. Two Pointer Technique");
        for(int i : arr)System.out.print(i + " ");
        Swapping(arr);
        System.out.println("\n3. Swapping Method: ");
        for(int i : arr)System.out.print(i + " ");
        RecursionMethod(arr,0,arr.length-1);
        System.out.println("\n4. Recursion Method: ");
        for(int i : arr)System.out.print(i + " ");
    }
}
