public class minValue {
    static void minvalue (int arr[]){
        int min = arr[0];

        for (int i=0 ; i < arr.length ; i++){

            if (min > arr[i] ) {
                min = arr[i] ;
            }
        }
        System.out.println("Min value :- " +min);
    }

    public static void main(String[] args) {
        int arr[] = {67,85,19,54 };
        minvalue(arr);
    }
}
