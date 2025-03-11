class LinearSearch{
    public static void main(String[] args){
        //To find the number 8
        //This program has O(n) complexity
        int[] arr = {2,3,4,5,9,0,1,6,8,7};
        for(int i = 0; i < arr.length;i++){
            if(arr[i] == 8){
                System.out.println("The index value for 8 is " + i);
                System.exit(0);
            }
        }
        System.out.println("Could not find the number 8 in the string");
    }
}