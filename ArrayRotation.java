public class ArrayRotation {
    //This is the naive method to reversing an array in the counterclockwise direction or left
    //In each iteration it moves the elements 1 step to the left
    //It takes O(n*d)Time and O(1) Space
    static void NaiveMethod(int[] arr, int d){

        for(int i = 0;i < d;i++){
            int first = arr[0];
            for(int j = 0; j < arr.length-1;j++){
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = first;
        }
    }
    //This method uses a temporary array, if we roatate element then last n-d elements in the front and 
    //the first d elements will be in the end
    //Uses O(n) and O(n) Time and Space Complexity
    static void TemporaryArray(int[] arr, int d){
        int[] temp = new int[arr.length];
        for(int j = 0; j < arr.length-d;j++)temp[j] = arr[j+d];
        for(int j = 0; j < d;j++)temp[arr.length - d + j] = arr[j];
        for(int i = 0; i < arr.length;i++)arr[i] = temp[i];
    }
    //Step 1: Reverse the first d elements subarray
    //Step 2: Reverse the next d elements subarray
    //Step 3: Reverse complete array
    //Uses O(n) Time and O(1) Space Complexity
    static void SubArrayReversal(int[] arr,int d){
        Reverse(arr,0,d-1);
        Reverse(arr,d,arr.length-1);
        Reverse(arr,0,arr.length-1);
    }
    static void Reverse(int[] arr, int s, int e){
        while(s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
         }
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8};
        int d = 2;

        NaiveMethod(arr,d);
        System.out.println("1. Naive Method");
        for(int i : arr)System.out.print(i + " ");

        TemporaryArray(arr,d);
        System.out.println("\n2. Temporary Array Method");
        for(int i : arr)System.out.print(i + " ");

        SubArrayReversal(arr,d);
        System.out.println("\n3. Sub Array Reversal Method");
        for(int i : arr)System.out.print(i + " ");
    }
}
