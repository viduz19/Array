public class Update {
    public static void main(String[] args) {

        int arr[] = {12,34,56,78,43,92};
        arr[2] = 100; // assign 100 for 56 value ( index-2)

        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
