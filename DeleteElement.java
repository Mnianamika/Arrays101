public class DeleteElement {
    static int FindElement(int[] arr, int el){
        for(int i = 0; i < arr.length; i++)if(arr[i] == el)return i;
        return -1;
    }
    static void DeleteEl(int[] arr, int index){
        for(int i = index; i < arr.length-1;i++){
            arr[i] = arr[i+1];
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int element = FindElement(arr,5);
        DeleteEl(arr,element);
        for(int i : arr)System.out.print(i + " ");
    }
}
