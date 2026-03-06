public class Average {

   public static double average(double[] arr) {

       double sum = 0;

       for (int i = 0; i < arr.length; i++) {

           sum += arr[i];

       }
       return sum / arr.length;

   }

    public static void main(String[] args) {

        double [] numbers = {90.9, 88.6, 55.60, 68.9};

        double result = average(numbers);
        System.out.println(result);
    }

}


