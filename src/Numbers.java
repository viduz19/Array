public class Numbers {

    static void numbers(int arr[]) {
        int min = arr[0];
        int max = arr[0];
        int sum = 0;
        double average;

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        for( int i:arr){
            sum = sum+i;
        }
        int len = arr.length;
        average = ((double)sum / (double)len );


        System.out.println("Minimum value :- " + min);
        System.out.println("Maximum value :- " + max);
        System.out.println("Sum value :- " +sum);
        System.out.println("Average value :- " +average);
    }

    public static void main(String[] args) {
        int [] arr = {1, 3, 54, 76, 87, 3, 4};
        numbers(arr);
    }
}

