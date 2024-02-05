class Work {
     static void Value(int array[]) {

        int min = array[0];
        int max = array[0];
        int sum = 0;
        double average ;
// Min value and Max value
        for (int i=0 ; i < array.length; i++){
            if (min > array[i]){
                min = array[i];
            } else if (max < array[i]){
                max = array[i];
            }
        }
// Sum and Average
        for (int i: array) {
            sum = sum +i;
        }
        int len = array.length;
        average = ((double)sum /(double)len);
// Same Value



         System.out.println("Minimum Value : " + min);
         System.out.println("Maximum Value : " + max);
         System.out.println("Total Value : " + sum);
         System.out.println("Avearage Value : " + average);
    }

    public static void main(String[] args) {
        int [] array = {1,3,54,76,87,3,4};
        Value(array);
    }



}
