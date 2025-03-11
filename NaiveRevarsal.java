public class NaiveRevarsal {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int[] rev = new int[arr.length];
        for(int i = 0 ; i < arr.length;i++) rev[i] = arr[arr.length-i-1];
        for(int i : rev)System.out.println(i);
    }
}
