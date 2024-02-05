public class Delete {
    public static void main(String[] args) {
        int arr[] = {5,10,15,20,25,30};

        // want delete value 20
        int index = 3 ; // delete value's index
        int size = 6; // array size(have element)

        for(int i = index; i <size-1 ; i++){
            arr[i] = arr[i+1];
        }

        for(int i=0 ; i<size-1 ;i++){
            System.out.println(arr[i]);
        }
    }
}
