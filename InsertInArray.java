public class InsertInArray {
    static void InsertEnd(int[] arr,int s){
        arr[arr.length-1] = s;
    }
    static void InsertAnywhere(int[] arr,int index,int num){
        for(int i = arr.length-1; i > index;i--){
            arr[i] = arr[i-1];
        }
        arr[index] = num;
    }
    public static void main(String[] args){
        int arr[] = {2,34,6,3,2,7,3,8,0};
        InsertEnd(arr,5);
        for(int i : arr)System.out.print(i + " ");
        InsertAnywhere(arr,2,5);
        System.out.println();
        for(int i : arr)System.out.print(i + " ");
    }
}
